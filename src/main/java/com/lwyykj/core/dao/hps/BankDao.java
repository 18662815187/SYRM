package com.lwyykj.core.dao.hps;

import com.lwyykj.core.bean.hps.Bank;
import com.lwyykj.core.bean.hps.BankQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankDao {
    int countByExample(BankQuery example);

    int deleteByExample(BankQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bank record);

    int insertSelective(Bank record);

    List<Bank> selectByExample(BankQuery example);

    Bank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bank record, @Param("example") BankQuery example);

    int updateByExample(@Param("record") Bank record, @Param("example") BankQuery example);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);
}