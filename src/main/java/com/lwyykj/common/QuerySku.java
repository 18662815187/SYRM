package com.lwyykj.common;



import javax.annotation.Resource;

import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.product.ProductStandardQuery;
import com.lwyykj.core.bean.product.ProductStandardQuery.Criteria;
import com.lwyykj.core.dao.product.ProductStandardDao;

public class QuerySku {
	@Resource
	private ProductStandardDao productStandardDao;
	public ProductStandard findById(Integer id,String name,Integer brandId) {
		ProductStandardQuery productQuery = new ProductStandardQuery();
		Criteria createCriteria = productQuery.createCriteria();
		if (null != name) {
			createCriteria.andProductNameLike("%" + name + "%");
		}
		if (null != brandId) {
			createCriteria.andBrandIdEqualTo(brandId);
		}
		
		createCriteria.andIdEqualTo(id);
		ProductStandard selectByPrimaryKey = productStandardDao.selectByPrimaryKey(id);
		System.out.println(selectByPrimaryKey.getProductName());
//		if (null != selectByExample && selectByExample.size() > 0) {
//			return selectByExample.get(0);
//		}
		return null;
	}
}
