package com.lwyykj.core.dao.shop;

import com.lwyykj.core.bean.shop.Orders;
import com.lwyykj.core.bean.shop.OrdersQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersDao {
    int countByExample(OrdersQuery example);

    int deleteByExample(OrdersQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersQuery example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersQuery example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersQuery example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}