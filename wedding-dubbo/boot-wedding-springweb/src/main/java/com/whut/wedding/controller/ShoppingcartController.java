package com.whut.wedding.controller;

import com.whut.wedding.entity.Shoppingcart;
import com.whut.wedding.entity.User;
import com.whut.wedding.service.ShoppingcartService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("shoppingcart")
public class ShoppingcartController {
    @DubboReference(version = "1.0.0")
    private ShoppingcartService shoppingcartService;
    /**
     * 实现购物车
     * @param shoppingcart
     * @return
     */
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ResponseBody
    public Boolean insertShoppingcart(HttpSession session,Shoppingcart shoppingcart){
        try {
            //设置加入数据库的主键id
            shoppingcart.setShoppingcartId(String.valueOf(System.currentTimeMillis()));
            //设置加购物车时间
            SimpleDateFormat format=new SimpleDateFormat("yyyy--MM-dd hh:mm:ss");
            String time=format.format(new Date());
            shoppingcart.setShoppingcartTime(time);
            //取出用户，设置用户的手机号码
            User user =(User) session.getAttribute("user");
            shoppingcart.setTbUserUserTel(user.getUserTel());
            System.out.println("!!!"+shoppingcart);
            shoppingcartService.insert(shoppingcart);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("findAll")
    public String findAll(Model model,HttpSession session){
        User user = (User)session.getAttribute("user");
        List<Shoppingcart> shoppingcarts = shoppingcartService.selectShoppingcartsByUserTel(user.getUserTel());
        model.addAttribute("shoppingcarts",shoppingcarts);
        return "Shopping_Cart";
    }

    @RequestMapping("findChecked")
    public String findChecked(Model model,HttpSession session){
        User user = (User)session.getAttribute("user");
        List<Shoppingcart> shoppingcarts = shoppingcartService.selectCheckedShoppingcartsByUserTel(user.getUserTel());
        model.addAttribute("shoppingcarts",shoppingcarts);
        return "payPage";
    }

    @RequestMapping(value = "updateCount",method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateCount(String id ,int count){
        try {
            shoppingcartService.updateCount(id,count);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping(value = "updateChecked",method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateChecked(String id ,int checked){
        try {
            shoppingcartService.updateChecked(id,checked);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }



}
