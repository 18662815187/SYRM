package com.lwyykj.core.dao.product;

import com.lwyykj.core.bean.product.PharmacyOrder;
import com.lwyykj.core.bean.product.PharmacyOrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PharmacyOrderDao {
    int countByExample(PharmacyOrderQuery example);

    int deleteByExample(PharmacyOrderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(PharmacyOrder record);

    int insertSelective(PharmacyOrder record);

    List<PharmacyOrder> selectByExample(PharmacyOrderQuery example);

    PharmacyOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PharmacyOrder record, @Param("example") PharmacyOrderQuery example);

    int updateByExample(@Param("record") PharmacyOrder record, @Param("example") PharmacyOrderQuery example);

    int updateByPrimaryKeySelective(PharmacyOrder record);

    int updateByPrimaryKey(PharmacyOrder record);
}