package com.lwyykj.core.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.product.ProductStandardQuery;
import com.lwyykj.core.bean.product.Sku;
import com.lwyykj.core.bean.product.SkuQuery;
import com.lwyykj.core.bean.product.SkuQuery.Criteria;
import com.lwyykj.core.dao.product.BrandDao;
import com.lwyykj.core.dao.product.FactoryDao;
import com.lwyykj.core.dao.product.ProductStandardDao;
import com.lwyykj.core.dao.product.SkuDao;
import com.lwyykj.core.service.BrandService;
import com.lwyykj.core.service.FactoryService;
import com.lwyykj.core.service.ProductService;
import com.lwyykj.core.service.SkuService;

@Service("skuService")
@Transactional
public class SkuServiceImpl implements SkuService {
	@Resource
	private SkuDao skuDao;
	@Resource
	private ProductStandardDao productStandardDao;
	@Resource
	private BrandDao brandDao;
	@Resource
	private FactoryDao factoryDao;
	@Resource
	private ProductService productService;
	@Resource
	private BrandService brandService;
	@Resource
	private FactoryService factoryService;

	// 通过药店ID查询Sku
	@Override
	public List<Sku> selectByPid(int id) {
		SkuQuery skuQuery = new SkuQuery();
		Criteria createCriteria = skuQuery.createCriteria();
		createCriteria.andPhIdEqualTo(id);
		return skuDao.selectByExample(skuQuery);
	}

	// 通过药店ID和产品ID找到sku对象
	public List<Sku> selectByPidProId(int pid, int proId) {
		SkuQuery skuQuery = new SkuQuery();
		Criteria createCriteria = skuQuery.createCriteria();
		createCriteria.andPhIdEqualTo(pid);
		createCriteria.andProStandIdEqualTo(proId);
		createCriteria.andIsDelEqualTo(false);
		List<Sku> skus = skuDao.selectByExample(skuQuery);
		if (null != skus && skus.size() > 0) {
			Sku sku = skus.get(0);
			ProductStandardQuery productStandardQuery = new ProductStandardQuery();
			com.lwyykj.core.bean.product.ProductStandardQuery.Criteria createCriteria2 = productStandardQuery
					.createCriteria();
			createCriteria2.andIsDelEqualTo(false);
			createCriteria2.andIdEqualTo(proId);
			List<ProductStandard> productStandards = productStandardDao.selectByExample(productStandardQuery);
			// System.out.println(productStandards.get(0).getProductName());
			if (null != productStandards && productStandards.size() > 0) {
				sku.setProductStandard(productStandards.get(0));
			}

			return skus;
		}
		return null;
	}

	// 根据sku_id查询sku
	public Sku findById(Integer id) {
		SkuQuery skuQuery = new SkuQuery();
		Criteria createCriteria = skuQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		createCriteria.andIsDelEqualTo(false);
		Sku sku = skuDao.selectByPrimaryKey(id);
		if (null != sku) {
			ProductStandard product = productService.findById(sku.getProStandId());
			if (null != product) {
				sku.setProductStandard(product);
			}
			return sku;
		}

		return null;
	}

	// 根据id更新is_del
	@Override
	public int deleteById(Integer id) {
		Sku sku = skuDao.selectByPrimaryKey(id);
		sku.setIsDel(true);
		SkuQuery skuQuery = new SkuQuery();
		Criteria createCriteria = skuQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		int result = skuDao.updateByExampleSelective(sku, skuQuery);
		return result;
	}

	@Override
	public int updateById(Integer id, BigDecimal price, Integer stock) {
		Sku sku = skuDao.selectByPrimaryKey(id);
		sku.setPrice(price);
		sku.setStock(stock);
		SkuQuery skuQuery = new SkuQuery();
		Criteria createCriteria = skuQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		int result = skuDao.updateByExampleSelective(sku, skuQuery);
		return result;
	}

	@Override
	public Sku findByPid(Integer pid, Integer phId) {
		Sku sku = skuDao.selectByPidAndUid(pid, phId);
		if (null != sku) {
			return sku;
		}
		return null;
	}

	@Override
	public int updateById(Sku sku) {
		int result = skuDao.updateByPrimaryKeySelective(sku);
		return result;
	}

}
