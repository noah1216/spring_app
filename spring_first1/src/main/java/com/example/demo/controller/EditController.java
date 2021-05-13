package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.controller.form.UpdateForm;
import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

@Controller

@RequestMapping("/edit")
public class EditController {
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;

	@GetMapping
	String geteEit(@RequestParam(name = "question") String q, Model model, @ModelAttribute UpdateForm updateForm) {

		int question_id = Integer.parseInt(q);
		//クエスチョンの取得
		Question question = questionService.findId(question_id);
		List<Answer> listA = answerService.findAnswer(question_id);
		model.addAttribute("question", question);
		model.addAttribute("answerList", listA);

		return "edit";
	}

}
