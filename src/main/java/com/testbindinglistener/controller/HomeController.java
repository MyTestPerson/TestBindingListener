package com.testbindinglistener.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String homePage () {
            return "/home";
    }



    @GetMapping(value = "/login")
    public String loginPageGet () {
        return "/login";
    }


    @PostMapping(value = "/login")
    public String loginPost () {
        return "redirect:/user";
    }



    @GetMapping(value = "/user")
    public String userPage () {
        return "/user";
    }



    @PostMapping(value = "/logout")
    public String logoutPost () {
        return "redirect:/";
    }

}
