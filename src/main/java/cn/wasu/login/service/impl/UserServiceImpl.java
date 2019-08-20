package cn.wasu.login.service.impl;

import cn.wasu.login.dao.UserDao;
import cn.wasu.login.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description 用户service
 * @Author Administrator
 * @Date 2019/8/9 17:41
 * @Version 1.0
 **/

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public String getPasswordByName(String username) {
        return userDao.getPasswordByName(username);
    }
}
