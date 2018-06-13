package com.lwyykj.core.dao.hps;

import com.lwyykj.core.bean.hps.SupplierBrand;
import com.lwyykj.core.bean.hps.SupplierBrandQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierBrandDao {
    int countByExample(SupplierBrandQuery example);

    int deleteByExample(SupplierBrandQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierBrand record);

    int insertSelective(SupplierBrand record);

    List<SupplierBrand> selectByExample(SupplierBrandQuery example);

    SupplierBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierBrand record, @Param("example") SupplierBrandQuery example);

    int updateByExample(@Param("record") SupplierBrand record, @Param("example") SupplierBrandQuery example);

    int updateByPrimaryKeySelective(SupplierBrand record);

    int updateByPrimaryKey(SupplierBrand record);
}