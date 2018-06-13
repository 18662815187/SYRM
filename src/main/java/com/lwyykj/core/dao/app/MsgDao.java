package com.lwyykj.core.dao.app;

import com.lwyykj.core.bean.app.Msg;
import com.lwyykj.core.bean.app.MsgQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgDao {
    int countByExample(MsgQuery example);

    int deleteByExample(MsgQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Msg record);

    int insertSelective(Msg record);

    List<Msg> selectByExample(MsgQuery example);

    Msg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Msg record, @Param("example") MsgQuery example);

    int updateByExample(@Param("record") Msg record, @Param("example") MsgQuery example);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}