package com.lwyykj.core.dao.shop;

import com.lwyykj.core.bean.shop.supBrand;
import com.lwyykj.core.bean.shop.supBrandQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface supBrandDao {
	int countByExample(supBrandQuery example);

	int deleteByExample(supBrandQuery example);

	int deleteByPrimaryKey(Integer id);

	int insert(supBrand record);

	int insertSelective(supBrand record);

	List<supBrand> selectByExample(supBrandQuery example);

	supBrand selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") supBrand record, @Param("example") supBrandQuery example);

	int updateByExample(@Param("record") supBrand record, @Param("example") supBrandQuery example);

	int updateByPrimaryKeySelective(supBrand record);

	int updateByPrimaryKey(supBrand record);

	supBrand findByBrandId(Integer id);
}