package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;
import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;


@Controller
@RequestMapping("/list")

public class ListController {
	@Autowired
	private QuestionService questionService;
	private AnswerService answerService;
	
	@GetMapping
	String getList(Model model) {
		List<Question> list = questionService.findAll();
		List<Answer> list2 = answerService.findAll();
		
		model.addAttribute("questionList",list);
		model.addAttribute("answerList",list2);
		
		return "list";
	} 

	@PostMapping
	String postLogin(@ModelAttribute LoginForm loginForm) {
		return "list";

	}
}
