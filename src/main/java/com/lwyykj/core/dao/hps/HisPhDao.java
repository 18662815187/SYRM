package com.lwyykj.core.dao.hps;

import com.lwyykj.core.bean.hps.HisPh;
import com.lwyykj.core.bean.hps.HisPhQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisPhDao {
    int countByExample(HisPhQuery example);

    int deleteByExample(HisPhQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(HisPh record);

    int insertSelective(HisPh record);

    List<HisPh> selectByExample(HisPhQuery example);

    HisPh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HisPh record, @Param("example") HisPhQuery example);

    int updateByExample(@Param("record") HisPh record, @Param("example") HisPhQuery example);

    int updateByPrimaryKeySelective(HisPh record);

    int updateByPrimaryKey(HisPh record);
}