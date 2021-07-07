package com.whut.wedding.controller;


import com.whut.wedding.service.UserService;
import com.whut.wedding.entity.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@Controller
@RequestMapping("user")
public class UserController {
    @DubboReference(version = "1.0.0")
    private UserService userService;
    //登录操作http:localhost:8080/user/login
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(Model model, String username , String password,String code,HttpSession session){
        //实现验证码的判断
        String rightCode = (String)session.getAttribute("code");
        if (rightCode==null || code==null || !rightCode.equals(code)){
            model.addAttribute("msg","验证码错误");
            return "forward:/login.html";
        }
        User user=userService.login(username,password);
        if(user!=null){
            //保存用户对象到session中
            session.setAttribute("user",user);
            return "redirect:/index.html";
        }
        model.addAttribute("msg","账号或密码错误");
        return "forward:/login.html";
    }

    /**
     * 生成随机数
     * @param response
     * @param session
     */
    @RequestMapping("code")
    public void creatCode(HttpServletResponse response, HttpSession session)throws IOException {
        Random random=new Random();
        //定义图片的宽和高
        int width=80;
        int height=35;
        //定义文字大小
        int fontsize=20;
        //创建缓冲图片（保存在内存中）
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        //获得图片的绘图对象
        Graphics g=image.getGraphics();
        //设置背景颜色
        g.setColor(Color.gray);
        //填充背景颜色
        g.fillRect(0,0,width,height);
        //设置字体
        g.setFont(new Font("宋体",Font.PLAIN,fontsize));
        //定义保存字母与数字的字符串
        String str="ABCDEFGHIJKLMNOPQRSTUVWSYZabcdefghijklmnopqrstuvwsvz1234567890";
        //定义颜色的数组
        Color[] colors={Color.black,Color.orange,Color.cyan,Color.green,Color.red,Color.pink,Color.yellow};
        //连接4个字母或数字，便于后台验证
        StringBuilder stringBuilder=new StringBuilder();
        //随机生成4个字母或数字
        for (int i = 0; i < 4; i++) {
            char ch=str.charAt(random.nextInt(str.length()));
            g.setColor(colors[random.nextInt(colors.length)]);
            g.drawString(String.valueOf(ch),fontsize * i+5,fontsize);
            g.drawLine(random.nextInt(width),random.nextInt(height),random.nextInt(width),random.nextInt(height));
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder.toString());
        //把验证码保存到Session中
        session.setAttribute("code",stringBuilder.toString());
        //设置响应头，让游览器不缓存图片
        response.addHeader("Cache-Control","no-cache");
        ImageIO.write(image,"PNG",response.getOutputStream());
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(Model model,HttpSession session,String username, String password,String code){
        //从session中获取验证码
        String rightCode = (String)session.getAttribute("code");
        if (rightCode==null || code==null || !rightCode.equals(code)){
            model.addAttribute("msg","验证码错误");
            return "forward:/register.html";
        }
        //判断用户是否存在
        User user = userService.selectUserByTel(username);
        if(user!=null)
        {
            model.addAttribute("msg","用户名已经存在");
            return "forward:/register.html";
        }
        userService.register(username,password);
        return "redirect:/login.html";
    }

    @RequestMapping(value = "checkTel",method = RequestMethod.POST)
    @ResponseBody
    public boolean checkTel(String username){
        User user = userService.selectUserByTel(username);
        //返回手机号是否存在
        if(user==null)
        {
            return false;
        }
        return true;
    }
    //*

    /**
     * 判断用户是否登录
     * @param session
     * @return
     */
    @RequestMapping("checkLogin")
    @ResponseBody
    public Boolean checkLogin(HttpSession session){
        Object user = session.getAttribute("user");
        if(user==null){
            return false;
        }
        else{
            return true;
        }
    }

}
