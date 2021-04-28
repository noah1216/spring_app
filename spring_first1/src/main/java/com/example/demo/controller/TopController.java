package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;
@Controller

@RequestMapping("/top")
public class TopController {
	@GetMapping
	String getLogout(HttpServletRequest request, @ModelAttribute LoginForm logiForm) {

		return "top";
	}
}