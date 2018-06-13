package com.lwyykj.core.dao.app;

import com.lwyykj.core.bean.app.Doctor;
import com.lwyykj.core.bean.app.DoctorQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorDao {
    int countByExample(DoctorQuery example);

    int deleteByExample(DoctorQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExampleWithBLOBs(DoctorQuery example);

    List<Doctor> selectByExample(DoctorQuery example);

    Doctor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorQuery example);

    int updateByExampleWithBLOBs(@Param("record") Doctor record, @Param("example") DoctorQuery example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorQuery example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKeyWithBLOBs(Doctor record);

    int updateByPrimaryKey(Doctor record);
}