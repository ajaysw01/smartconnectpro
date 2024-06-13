package com.aj.SmartConnectPro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.val;

@Controller
@RequestMapping("/user")
public class UserController {

    //usesr dashboard)
    @RequestMapping(value="/dashboard")
    public String userDashboard(){
        return "user/dashboard";
    }
    //user add contact

}
