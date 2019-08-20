package cn.wasu.login.service;

import org.apache.ibatis.annotations.Param;

public interface UserService {
    String getPasswordByName(String username);
}
