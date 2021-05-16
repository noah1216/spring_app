package com.example.demo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.TestForm;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

@Controller
@RequestMapping("/test")

public class TestController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;

	@GetMapping
	String getList(Model model, @ModelAttribute TestForm testForm) {
		List<Question> list = questionService.findAll();
		Collections.shuffle(list);

		model.addAttribute("questionList", list);
		return "test";
	}

	@PostMapping
	String postLogin() {
		return "result";

	}
}
