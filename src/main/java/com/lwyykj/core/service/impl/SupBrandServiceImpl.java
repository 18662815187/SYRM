package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.shop.proBrandShop;
import com.lwyykj.core.bean.shop.proBrandShopQuery;
import com.lwyykj.core.bean.shop.proBrandShopQuery.Criteria;
import com.lwyykj.core.dao.shop.proBrandShopDao;
import com.lwyykj.core.service.SupBrandService;
import cn.itcast.common.page.Pagination;

/**
 * 
 * @author john
 *
 */
@Service("supBrandService")
public class SupBrandServiceImpl implements SupBrandService {
	@Resource
	private proBrandShopDao proBrandShopDao;

	@Override
	public Pagination findBySid(Integer sid, Integer pageNo, String name) {
		StringBuilder sb = new StringBuilder();
		proBrandShopQuery proBrandShopQuery = new proBrandShopQuery();
		proBrandShopQuery.setPageNo(Pagination.cpn(pageNo));
		proBrandShopQuery.setPageSize(20);
		Criteria createCriteria = proBrandShopQuery.createCriteria();
		createCriteria.andSupIdEqualTo(sid);
		if (null != name) {
			createCriteria.andProNameLike("%" + name + "%");
			sb.append("name=").append(name);
		}
		List<proBrandShop> proBrandShops = proBrandShopDao.selectByExample(proBrandShopQuery);
		if (null != proBrandShops && proBrandShops.size() > 0) {
			Pagination pagination = new Pagination(proBrandShopQuery.getPageNo(), proBrandShopQuery.getPageSize(),
					proBrandShopDao.countByExample(proBrandShopQuery), proBrandShops);
			// 分页展示,需要传入链接和拼接条件
			String url = "/shopping/toProList";
			pagination.pageView(url, sb.toString());
			return pagination;
		}
		return null;
	}

}
