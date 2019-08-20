package cn.wasu.login.controller;

import cn.wasu.login.domain.User;
import cn.wasu.login.service.UserService;
import cn.wasu.login.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName UserController
 * @Description 登录登出controller
 * @Author Administrator
 * @Date 2019/8/9 17:43
 * @Version 1.0
 **/

@Controller
@RequestMapping(value="/login")
public class LoginController {
    //app开发者登录
    @RequestMapping(value = "/login_dev")
    public String login_dev(){
        return "/dev/devlogin";
    }

    //app开发者登出
    @RequestMapping(value = "/loginOut_dev")
    public String loginOut_dev(HttpSession session){
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "/dev/devlogin";
    }

    //app后台管理者登录
    @RequestMapping(value = "/login_bac")
    public String login_bac(){
        return "/bac/baclogin";
    }

    //app后台管理者登出
    @RequestMapping(value = "/loginOut_bac")
    public String loginOut_bac(HttpSession session){
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "/bac/baclogin";
    }
    //app后台管理者登出
    @RequestMapping(value = "/test")
    public String test(HttpSession session){
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "/bac/baclogin";
    }
}
