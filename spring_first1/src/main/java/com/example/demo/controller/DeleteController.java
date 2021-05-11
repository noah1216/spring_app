package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

@Controller

@RequestMapping("/delete")
public class DeleteController {
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;

	@GetMapping
	String getRegiste(@RequestParam(name = "question") String q, Model model) {

		int question_id = Integer.parseInt(q);
		System.out.println(question_id);
		//クエスチョンの取得
		Question question = questionService.findId(question_id);
		List<Answer> listA = answerService.findAnswer(question_id);
		System.out.println(question);
		System.out.println(listA);
		model.addAttribute("question", question);
		//		model.addAttribute("answerList", listA);

		return "delete";
	}

}
