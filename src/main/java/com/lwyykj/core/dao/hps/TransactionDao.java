package com.lwyykj.core.dao.hps;

import com.lwyykj.core.bean.hps.Transaction;
import com.lwyykj.core.bean.hps.TransactionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionDao {
    int countByExample(TransactionQuery example);

    int deleteByExample(TransactionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    List<Transaction> selectByExample(TransactionQuery example);

    Transaction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionQuery example);

    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionQuery example);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);
}