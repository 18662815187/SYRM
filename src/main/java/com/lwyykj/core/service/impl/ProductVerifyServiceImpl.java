package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.ProductVerify;
import com.lwyykj.core.bean.product.ProductVerifyQuery;
import com.lwyykj.core.bean.product.ProductVerifyQuery.Criteria;
import com.lwyykj.core.dao.product.ProductVerifyDao;
import com.lwyykj.core.service.ProductVerifyService;

import cn.itcast.common.page.Pagination;

@Service("productVerifyService")
@Transactional
public class ProductVerifyServiceImpl implements ProductVerifyService {
	@Resource
	private ProductVerifyDao productVerifyDao;

	// 分页对象
	@Override
	public Pagination selectPaginationByQuery(Integer pageNo, String name,HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		ProductVerifyQuery productVerifyQuery = new ProductVerifyQuery();
		productVerifyQuery.setPageNo(Pagination.cpn(pageNo));
		productVerifyQuery.setOrderByClause("id desc");
		Criteria createCriteria = productVerifyQuery.createCriteria();
		createCriteria.andIsDelEqualTo(false);
		Integer id =(Integer) request.getSession().getAttribute("pid");
		createCriteria.andPhIdEqualTo(id);
		if (null != name) {
			createCriteria.andProductNameLike("%" + name + "%");
			params.append("name=").append(name);
		}
		List<ProductVerify> products = productVerifyDao.selectByExample(productVerifyQuery);
		if (null != products && products.size() > 0) {
			Pagination pagination = new Pagination(productVerifyQuery.getPageNo(), productVerifyQuery.getPageSize(),
					productVerifyDao.countByExample(productVerifyQuery), products);
			// 分页展示,需要传入链接和拼接条件
			String url = "/Pvc/list.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 单删(更新假删除)
	public int deleteById(Integer id) {
		ProductVerifyQuery productVerifyQuery = new ProductVerifyQuery();
		Criteria createCriteria = productVerifyQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		ProductVerify product = productVerifyDao.selectByPrimaryKey(id);
		product.setIsDel(true);
		int result = productVerifyDao.updateByExample(product, productVerifyQuery);
		return result;
	}

	// 根据id查询
	@Override
	public ProductVerify selectById(Integer id) {
		ProductVerify product = productVerifyDao.selectByPrimaryKey(id);
		if (null != product) {
			return product;
		}
		return null;
	}
	//保存
	@Override
	public int save(ProductVerify product) {
		int result = productVerifyDao.insertSelective(product);
		return result;
	}
	//更新
	@Override
	public int update(ProductVerify product) {
		int result = productVerifyDao.updateByPrimaryKeySelective(product);
		return result;
	}
}
