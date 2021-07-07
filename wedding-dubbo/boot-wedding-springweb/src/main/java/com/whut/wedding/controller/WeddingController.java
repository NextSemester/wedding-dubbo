package com.whut.wedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 页面控制器
 */
@Controller
public class WeddingController {
    //访问wedding.html
    @RequestMapping("index.html")
    public String index(){
        return "wedding";
    }
    //访问login.html
    @RequestMapping("login.html")
    public String toLogin(){
        return "login";
    }
    //访问注册页面
    @RequestMapping("register.html")
    public String register(){
        return "register";
    }

}
