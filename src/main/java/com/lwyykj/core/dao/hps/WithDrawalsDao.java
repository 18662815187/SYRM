package com.lwyykj.core.dao.hps;

import com.lwyykj.core.bean.hps.WithDrawals;
import com.lwyykj.core.bean.hps.WithDrawalsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithDrawalsDao {
    int countByExample(WithDrawalsQuery example);

    int deleteByExample(WithDrawalsQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(WithDrawals record);

    int insertSelective(WithDrawals record);

    List<WithDrawals> selectByExample(WithDrawalsQuery example);

    WithDrawals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WithDrawals record, @Param("example") WithDrawalsQuery example);

    int updateByExample(@Param("record") WithDrawals record, @Param("example") WithDrawalsQuery example);

    int updateByPrimaryKeySelective(WithDrawals record);

    int updateByPrimaryKey(WithDrawals record);
}