package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    //GETメソッド
    @GetMapping("/login")
    public String getLogin(Model model) {
        //login.htmlに画面遷移
        return "login";
    }

    //POSTメソッド
    @PostMapping("/login")
    public String postLogin(Model model) {
        return "login";
    }
}