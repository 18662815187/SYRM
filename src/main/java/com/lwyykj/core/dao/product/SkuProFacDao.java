package com.lwyykj.core.dao.product;

import com.lwyykj.core.bean.product.SkuProFac;
import com.lwyykj.core.bean.product.SkuProFacQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkuProFacDao {
    int countByExample(SkuProFacQuery example);

    int deleteByExample(SkuProFacQuery example);

    int insert(SkuProFac record);

    int insertSelective(SkuProFac record);

    List<SkuProFac> selectByExampleWithBLOBs(SkuProFacQuery example);

    List<SkuProFac> selectByExample(SkuProFacQuery example);

    int updateByExampleSelective(@Param("record") SkuProFac record, @Param("example") SkuProFacQuery example);

    int updateByExampleWithBLOBs(@Param("record") SkuProFac record, @Param("example") SkuProFacQuery example);

    int updateByExample(@Param("record") SkuProFac record, @Param("example") SkuProFacQuery example);
}