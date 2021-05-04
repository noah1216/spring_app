package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

	@RequestMapping("/register")
	public class RegisterController {
		@GetMapping
		String getLogout(Model model) {

			return "register"; 
		}
}