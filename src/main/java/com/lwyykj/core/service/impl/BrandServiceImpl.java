package com.lwyykj.core.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.Brand;
import com.lwyykj.core.bean.product.BrandQuery;
import com.lwyykj.core.bean.product.BrandQuery.Criteria;
import com.lwyykj.core.dao.product.BrandDao;
import com.lwyykj.core.service.BrandService;

@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService {
	@Resource
	private BrandDao brandDao;

	// 显示未删除的所有品牌
	@Override
	public List<Brand> selectBrandListByQuery(Boolean isDel) {
		BrandQuery brandQuery = new BrandQuery();
		Criteria createCriteria = brandQuery.createCriteria();
		createCriteria.andIsDelEqualTo(isDel);
		List<Brand> brands = brandDao.selectByExample(brandQuery);
		if (brands != null && brands.size() > 0) {
			return brands;
		}
		return null;
	}

	// 通过id查询
	public Brand findById(int id) {
		BrandQuery brandQuery = new BrandQuery();
		Criteria createCriteria = brandQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		List<Brand> brands = brandDao.selectByExample(brandQuery);
		if (null != brands && brands.size() > 0) {
			return brands.get(0);
		}
		return null;
	}
}
