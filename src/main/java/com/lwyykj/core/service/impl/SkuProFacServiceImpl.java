package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.SkuProFac;
import com.lwyykj.core.bean.product.SkuProFacQuery;
import com.lwyykj.core.bean.product.SkuProFacQuery.Criteria;
import com.lwyykj.core.dao.product.SkuProFacDao;
import com.lwyykj.core.dao.shop.supBrandDao;
import com.lwyykj.core.service.SkuProFacService;

import cn.itcast.common.page.Pagination;

@Service("skuProService")
@Transactional
public class SkuProFacServiceImpl implements SkuProFacService {
	@Resource
	private SkuProFacDao skuProFacDao;
	@Resource
	private supBrandDao supBrandDao;
	// 查询复合条件的所有数据

	@Override
	public Pagination selectPaginationByQuery(Integer pageNo, String name, Integer brandId, Integer uid) {
		StringBuilder params = new StringBuilder();
		SkuProFacQuery skuProFacQuery = new SkuProFacQuery();
		skuProFacQuery.setPageNo(Pagination.cpn(pageNo));
		skuProFacQuery.setOrderByClause("id desc");
		Criteria createCriteria = skuProFacQuery.createCriteria();
		createCriteria.andIsDelEqualTo(false);
		createCriteria.andPhIdEqualTo(uid);
		if (null != name) {
			createCriteria.andProductNameLike("%" + name + "%");
			params.append("name=").append(name);
		}
		if (null != brandId) {
			createCriteria.andBrandIdEqualTo(brandId);
			params.append("&brandId=").append(brandId);
		}
		List<SkuProFac> skuProFacs = skuProFacDao.selectByExample(skuProFacQuery);
		if (null != skuProFacs && skuProFacs.size() > 0) {
			for (SkuProFac skuProFac : skuProFacs) {
				skuProFac.setSupBrand(supBrandDao.findByBrandId(skuProFac.getBrandId()));
			}
			Pagination pagination = new Pagination(skuProFacQuery.getPageNo(), skuProFacQuery.getPageSize(),
					skuProFacDao.countByExample(skuProFacQuery), skuProFacs);
			// 分页展示,需要传入链接和拼接条件
			String url = "/product/list.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

}
