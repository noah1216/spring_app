package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
//    GETメソッド
@RequestMapping("/login")
    public class LoginController {
	@Autowired
	private UserService userService;
        //login.htmlに画面遷移
    	 @GetMapping
    	    String getLogin(@ModelAttribute LoginForm logiForm) {
        return "login";
    }

    //POSTメソッド
    	    @PostMapping
    	    String postLogin(@ModelAttribute LoginForm loginForm) {
    	    System.out.println(loginForm.getName());
    	    System.out.println(loginForm.getPassword());
    	    	// ユーザーの確認
    	    	
    	    User user = userService.getUser(loginForm.getName(), loginForm.getPassword());
//    	    System.out.println("UserName"+ user.getName());
//    	    System.out.println("UserId"+ user.getId());
    	    
    	    if (Objects.isNull(user)) {
    	    	return "login";
    	    }
    	    return "sample";
    }
    
}