package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.UpdateForm;
import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

@Controller

@RequestMapping("/confirm")
public class ConfirmController {
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;

	@GetMapping
	String geteConfirm(@Validated @ModelAttribute UpdateForm updateForm, Model model, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			String q = updateForm.getQuestionId();
			int question_id = Integer.parseInt(q);
			//クエスチョンの取得
			Question question = questionService.findId(question_id);
			List<Answer> listA = answerService.findAnswer(question_id);
			model.addAttribute("question", question);
			model.addAttribute("answerList", listA);
			return "edit";
		}
		String a = updateForm.getAnswer();
		String b = updateForm.getAnswerId();
		String[] answer = a.split(",");
		String[] answerId = b.split(",");

		String question = updateForm.getQuestion();
		String id = updateForm.getQuestionId();

		model.addAttribute("answerIds", answerId);
		model.addAttribute("answers", answer);
		model.addAttribute("question", question);
		model.addAttribute("id", id);
		return "confirm";
	}

	@PostMapping
	String postConfirm(@ModelAttribute UpdateForm updateForm, Model model) {
		String a = updateForm.getAnswer();
		String b = updateForm.getAnswerIds();
		//		System.out.println(a);
		//		System.out.println(b);
		String[] answers = a.split(",");

		System.out.println(b);

		String question = updateForm.getQuestion();
		String id = updateForm.getQuestionId();

		//　questionの更新
		int questionId = Integer.parseInt(id);
		//		questionService.update(question, questionId);

		// アンサーの更新
		int count = 0;
		for (String answer : answers) {
			//						int i = b.length;
			//			System.out.println("coubt::::" + i);
			//			int answerId = Integer.parseInt(i);
			//			System.out.println(answerId);
			System.out.println(answer);
			//			answerService.update(answer, answerId);

			count = count + 1;
			System.out.println(count);
		}
		return "top";

	}
}
