package cn.wasu.login.dao;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
    String getPasswordByName(@Param(value="username")String username);
}
