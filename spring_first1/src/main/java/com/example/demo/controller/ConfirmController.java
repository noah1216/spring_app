package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.UpdateForm;

@Controller

@RequestMapping("/confirm")
public class ConfirmController {
	@GetMapping
	String geteConfirm(@ModelAttribute UpdateForm updateForm, Model model) {
		String answer = updateForm.getAnswer();
		String question = updateForm.getQuestion();
		String id = updateForm.getQuestionId();

		model.addAttribute("answer", answer);
		model.addAttribute("question", question);
		model.addAttribute("id", id);
		return "confirm";
	}

	@PostMapping
	String postConfirm() {
		return null;

	}
}
