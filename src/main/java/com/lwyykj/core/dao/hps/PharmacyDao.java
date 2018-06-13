package com.lwyykj.core.dao.hps;

import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.bean.hps.PharmacyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PharmacyDao {
    int countByExample(PharmacyQuery example);

    int deleteByExample(PharmacyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pharmacy record);

    int insertSelective(Pharmacy record);

    List<Pharmacy> selectByExample(PharmacyQuery example);

    Pharmacy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pharmacy record, @Param("example") PharmacyQuery example);

    int updateByExample(@Param("record") Pharmacy record, @Param("example") PharmacyQuery example);

    int updateByPrimaryKeySelective(Pharmacy record);

    int updateByPrimaryKey(Pharmacy record);
}