package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;

@Controller

@RequestMapping("/top")
public class TopController {

	@Autowired
	HttpSession session;

	@GetMapping
	String getLogout(HttpServletRequest request, @ModelAttribute LoginForm logiForm) {
		String user_name = (String) session.getAttribute("login_name");
		System.out.println(user_name);
		return "top";
	}
}