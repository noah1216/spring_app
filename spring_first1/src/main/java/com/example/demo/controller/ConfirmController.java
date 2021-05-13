package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.UpdateForm;

@Controller

@RequestMapping("/confirm")
public class ConfirmController {
	@GetMapping
	String geteConfirm(@ModelAttribute UpdateForm updateForm) {

		return "edit";
	}

}
