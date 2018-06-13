package com.lwyykj.core.dao.product;

import com.lwyykj.core.bean.product.BrandSup;
import com.lwyykj.core.bean.product.BrandSupQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandSupDao {
    int countByExample(BrandSupQuery example);

    int deleteByExample(BrandSupQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandSup record);

    int insertSelective(BrandSup record);

    List<BrandSup> selectByExample(BrandSupQuery example);

    BrandSup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandSup record, @Param("example") BrandSupQuery example);

    int updateByExample(@Param("record") BrandSup record, @Param("example") BrandSupQuery example);

    int updateByPrimaryKeySelective(BrandSup record);

    int updateByPrimaryKey(BrandSup record);
}