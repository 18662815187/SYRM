package com.lwyykj.core.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.Brand;
import com.lwyykj.core.bean.product.BrandQuery;
import com.lwyykj.core.bean.product.Factory;
import com.lwyykj.core.bean.product.FactoryQuery;
import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.product.ProductStandardQuery;
import com.lwyykj.core.bean.product.ProductStandardQuery.Criteria;
import com.lwyykj.core.bean.product.Sku;
import com.lwyykj.core.bean.product.SkuQuery;
import com.lwyykj.core.dao.product.BrandDao;
import com.lwyykj.core.dao.product.BrandSupDao;
import com.lwyykj.core.dao.product.FactoryDao;
import com.lwyykj.core.dao.product.ProductStandardDao;
import com.lwyykj.core.dao.product.SkuDao;
import com.lwyykj.core.service.ProductService;
import cn.itcast.common.page.Pagination;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	@Resource
	private BrandSupDao brandSupDao;
	@Resource
	private ProductStandardDao productStandardDao;
	@Resource
	private SkuDao SkuDao;
	@Resource
	private BrandDao brandDao;
	@Resource
	private FactoryDao factoryDao;

	// 列表页分页对象
	@Override
	public Pagination selectPaginationByQuery(Integer pageNo, String name, Integer brandId, Integer uid) {
		SkuQuery skuQuery = new SkuQuery();
		com.lwyykj.core.bean.product.SkuQuery.Criteria SkucreateCriteria = skuQuery.createCriteria();
		FactoryQuery factoryQuery = new FactoryQuery();
		com.lwyykj.core.bean.product.FactoryQuery.Criteria FactorycreateCriteria = factoryQuery.createCriteria();
		BrandQuery brandQuery = new BrandQuery();
		com.lwyykj.core.bean.product.BrandQuery.Criteria brandCriteria = brandQuery.createCriteria();
		ProductStandardQuery productStandardQuery = new ProductStandardQuery();
		productStandardQuery.setPageNo(Pagination.cpn(pageNo));
		productStandardQuery.setOrderByClause("id desc");
		Criteria createCriteria = productStandardQuery.createCriteria();
		createCriteria.andIsDelEqualTo(false);
		StringBuilder params = new StringBuilder();
		if (null != name) {
			createCriteria.andProductNameLike("%" + name + "%");
			params.append("name=").append(name);
		}
		if (null != brandId) {
			createCriteria.andBrandIdEqualTo(brandId);
			params.append("&brandId=").append(brandId);
		}
		List<ProductStandard> productStandards = productStandardDao.selectByExample(productStandardQuery);
		if (null != productStandards && productStandards.size() > 0) {
			for (ProductStandard productStandard : productStandards) {
				SkucreateCriteria.andPhIdEqualTo(uid);
				SkucreateCriteria.andProStandIdEqualTo(productStandard.getId());
				SkucreateCriteria.andIsDelEqualTo(false);
				List<Sku> skus = SkuDao.selectByExample(skuQuery);
				if (skus != null && skus.size() > 0) {
					productStandard.setSku(skus.get(0));
				}
				FactorycreateCriteria.andIdEqualTo(productStandard.getFactoryId());
				FactorycreateCriteria.andIsDelEqualTo(false);
				FactorycreateCriteria.andIsShowEqualTo(true);
				List<Factory> factories = factoryDao.selectByExample(factoryQuery);
				if (null != factories && factories.size() > 0) {
					productStandard.setFactory(factories.get(0));
				}
				brandCriteria.andIdEqualTo(productStandard.getBrandId());
				brandCriteria.andIsDelEqualTo(false);
				List<Brand> brands = brandDao.selectByExample(brandQuery);
				if (null != brands && brands.size() > 0) {
					productStandard.setBrand(brands.get(0));
				}
			}
			Pagination pagination = new Pagination(productStandardQuery.getPageNo(), productStandardQuery.getPageSize(),
					productStandardDao.countByExample(productStandardQuery), productStandards);

			// 分页展示,需要传入链接和拼接条件
			String url = "/product/list.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 根据ID，name,品牌ID查询对象
	@Override
	public ProductStandard findPro(ProductStandardQuery productQuery) {
		List<ProductStandard> products = productStandardDao.selectByExample(productQuery);
		if (null != products && products.size() > 0) {
			return products.get(0);
		}
		return null;
	}

	// 根据产品ID取产品对象
	public ProductStandard findById(Integer id) {
		ProductStandard product = productStandardDao.selectByPrimaryKey(id);
		if (null != product) {
			return product;
		}
		return null;
	}

	@Override
	public int findByPid(int id) {
		ProductStandard product = productStandardDao.selectByPrimaryKey(id);
		if (null != product) {
			return product.getFactoryId();
		}
		return 0;
	}

}
