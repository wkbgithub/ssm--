package com.wkbcode.controller;


import java.util.Map;

import com.wkbcode.pojo.UUser;
import com.wkbcode.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);


    @Autowired
    UserService userService;


    @RequestMapping(value="/index")
    @ResponseBody
    public String index(){
        logger.info("info   日志");
        logger.error("error   日志");
        logger.debug("debug   日志");
        
        
        UUser user  = userService.findByName("");
        ModelAndView model = new ModelAndView();
        model.addObject("user", user);
        return user.toString();

    }


    @RequestMapping(value="/login")
    @ResponseBody
    public String login(UUser user){
        UUser user1 = userService.getUserByid(user);
        logger.info("user1 info : " + user1);

        return "successlogin";
    }

    public static void main(String[] args) {
       int a = 1/0;
        System.out.println(a);
    }
}
