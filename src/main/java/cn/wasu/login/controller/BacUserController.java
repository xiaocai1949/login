package cn.wasu.login.controller;

import cn.wasu.login.domain.User;
import cn.wasu.login.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName DevUserController
 * @Description 开发者管理类
 * @Author Administrator
 * @Date 2019/8/16 11:22
 * @Version 1.0
 **/

@Controller
@RequestMapping("/bac")
public class BacUserController {
    private static final Logger logger = LoggerFactory.getLogger(BacUserController.class);
    @Resource
    private UserService userService;
    @RequestMapping(value="/login",method = RequestMethod.POST)
    private String login(HttpServletRequest request, Model model){
        logger.info("用户开始登录,用户信息:{}",request);
        String pass=userService.getPasswordByName(request.getParameter("username"));
        String password=request.getParameter("password");
        if(!pass.equals(password)){
            logger.info("用户名或密码错误!");
            return "error";
        }
        User user=new User();
        user.setUserName(request.getParameter("username"));
        user.setPassWord(password);
        model.addAttribute("user", user);
        logger.info("登录成功!");
        return "success";
    }
}
