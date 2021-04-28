package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

@RequestMapping("/logout")
public class LogoutController {
	 @GetMapping
	    String getLogout(HttpServletRequest request) {
		 HttpSession session = request.getSession(false);
			
		    if (session != null){
			      session.invalidate();
			      session = request.getSession(false);

			      if (session == null) {
			    	  return "login";
			      }
			   }
			
		    return "login";
		}
	 
	 
	 
	@PostMapping
    String postLogout(HttpServletRequest request) {
		return null;
		
		
	}
}