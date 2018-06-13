package com.lwyykj.core.dao.shop;

import com.lwyykj.core.bean.shop.OrdersPro;
import com.lwyykj.core.bean.shop.OrdersProQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersProDao {
    int countByExample(OrdersProQuery example);

    int deleteByExample(OrdersProQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrdersPro record);

    int insertSelective(OrdersPro record);

    List<OrdersPro> selectByExample(OrdersProQuery example);

    OrdersPro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrdersPro record, @Param("example") OrdersProQuery example);

    int updateByExample(@Param("record") OrdersPro record, @Param("example") OrdersProQuery example);

    int updateByPrimaryKeySelective(OrdersPro record);

    int updateByPrimaryKey(OrdersPro record);
}