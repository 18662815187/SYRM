package com.lwyykj.core.dao.shop;

import com.lwyykj.core.bean.shop.proBrandShop;
import com.lwyykj.core.bean.shop.proBrandShopQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface proBrandShopDao {
    int countByExample(proBrandShopQuery example);

    int deleteByExample(proBrandShopQuery example);

    int insert(proBrandShop record);

    int insertSelective(proBrandShop record);

    List<proBrandShop> selectByExample(proBrandShopQuery example);

    int updateByExampleSelective(@Param("record") proBrandShop record, @Param("example") proBrandShopQuery example);

    int updateByExample(@Param("record") proBrandShop record, @Param("example") proBrandShopQuery example);
}