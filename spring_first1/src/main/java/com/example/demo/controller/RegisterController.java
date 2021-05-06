package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.RegisterForm;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@GetMapping
	String getRegister(@ModelAttribute RegisterForm registerForm) {

		return "register";
	}

}