package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;

@Controller
//    GETメソッド
@RequestMapping("/login")
    public class LoginController {
        //login.htmlに画面遷移
    	 @GetMapping
    	    String getLogin(@ModelAttribute LoginForm loginform) {
        return "login";
    }

    //POSTメソッド
    	    @PostMapping
    	    String postLogin(@ModelAttribute LoginForm loginform) {
    	    System.out.println(loginform.getName());
    	    System.out.println(loginform.getPassword());
    	    	// ユーザーの確認
    	    	
    	        return "redirect:/sample";
    }
    
}