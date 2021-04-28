package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;



@Controller

@RequestMapping("/logout")
public class LogoutController {
	@GetMapping
	String getLogout(HttpServletRequest request, @ModelAttribute LoginForm logiForm) {
		HttpSession session = request.getSession(false);

		if (session != null){
			session.removeAttribute("login_id");
		}
		return null;
	}



		@PostMapping
		String postLogout(HttpServletRequest request) {
			return null;


	}
}