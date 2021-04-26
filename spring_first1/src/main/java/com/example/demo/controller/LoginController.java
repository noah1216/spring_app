package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//    GETメソッド
@RequestMapping("/login")
    public class LoginController {
        //login.htmlに画面遷移
    	 @GetMapping
    	    String getLogin() {
        return "login";
    }

    //POSTメソッド
    	    @PostMapping
    	    String postLogin() {
    	        return "redirect:/menu";
    }
    
}