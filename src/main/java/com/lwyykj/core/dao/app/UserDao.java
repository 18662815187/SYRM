package com.lwyykj.core.dao.app;

import com.lwyykj.core.bean.app.User;
import com.lwyykj.core.bean.app.UserQuery;
import com.lwyykj.core.bean.app.UserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    List<UserWithBLOBs> selectByExampleWithBLOBs(UserQuery example);

    List<User> selectByExample(UserQuery example);

    UserWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWithBLOBs record, @Param("example") UserQuery example);

    int updateByExampleWithBLOBs(@Param("record") UserWithBLOBs record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}