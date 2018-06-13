package com.lwyykj.core.dao.product;

import com.lwyykj.core.bean.product.ProductVerify;
import com.lwyykj.core.bean.product.ProductVerifyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductVerifyDao {
    int countByExample(ProductVerifyQuery example);

    int deleteByExample(ProductVerifyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductVerify record);

    int insertSelective(ProductVerify record);

    List<ProductVerify> selectByExample(ProductVerifyQuery example);

    ProductVerify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductVerify record, @Param("example") ProductVerifyQuery example);

    int updateByExample(@Param("record") ProductVerify record, @Param("example") ProductVerifyQuery example);

    int updateByPrimaryKeySelective(ProductVerify record);

    int updateByPrimaryKey(ProductVerify record);
}