package com.lab.country.controller;

import com.lab.country.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author ruin
 * @date 2019/5/24-20:42
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/dologin")
    public String dologin(
            @RequestParam("account") String account, @RequestParam("password") String password,
            HttpSession session){
        if(userService.checkUserLogin(account,password)){

            session.setAttribute("account",account);
            return "1";
        }
        return "0";
    }

    @RequestMapping("/doregister")
    public String doregister(
            @RequestParam("account") String account,@RequestParam("password") String password){
            userService.register(account,password);
            return "landingPages/regSuccess";
    }

    @ResponseBody
    @RequestMapping("/checkAccount")
    public String checkAccount(@RequestParam("account")String account){
        if(userService.checkAccount(account))
            return "1";
        return "0";
    }

}
