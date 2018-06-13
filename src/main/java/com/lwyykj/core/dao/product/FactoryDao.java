package com.lwyykj.core.dao.product;

import com.lwyykj.core.bean.product.Factory;
import com.lwyykj.core.bean.product.FactoryQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryDao {
    int countByExample(FactoryQuery example);

    int deleteByExample(FactoryQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Factory record);

    int insertSelective(Factory record);

    List<Factory> selectByExampleWithBLOBs(FactoryQuery example);

    List<Factory> selectByExample(FactoryQuery example);

    Factory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Factory record, @Param("example") FactoryQuery example);

    int updateByExampleWithBLOBs(@Param("record") Factory record, @Param("example") FactoryQuery example);

    int updateByExample(@Param("record") Factory record, @Param("example") FactoryQuery example);

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKeyWithBLOBs(Factory record);

    int updateByPrimaryKey(Factory record);
    
}