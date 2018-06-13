package com.lwyykj.core.dao.shop;

import com.lwyykj.core.bean.shop.shopCart;
import com.lwyykj.core.bean.shop.shopCartQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shopCartDao {
    int countByExample(shopCartQuery example);

    int deleteByExample(shopCartQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(shopCart record);

    int insertSelective(shopCart record);

    List<shopCart> selectByExample(shopCartQuery example);

    shopCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") shopCart record, @Param("example") shopCartQuery example);

    int updateByExample(@Param("record") shopCart record, @Param("example") shopCartQuery example);

    int updateByPrimaryKeySelective(shopCart record);

    int updateByPrimaryKey(shopCart record);
}