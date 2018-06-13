package com.lwyykj.core.dao.product;

import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.product.ProductStandardQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductStandardDao {
    int countByExample(ProductStandardQuery example);

    int deleteByExample(ProductStandardQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductStandard record);

    int insertSelective(ProductStandard record);

    List<ProductStandard> selectByExample(ProductStandardQuery example);

    ProductStandard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductStandard record, @Param("example") ProductStandardQuery example);

    int updateByExample(@Param("record") ProductStandard record, @Param("example") ProductStandardQuery example);

    int updateByPrimaryKeySelective(ProductStandard record);

    int updateByPrimaryKey(ProductStandard record);
}