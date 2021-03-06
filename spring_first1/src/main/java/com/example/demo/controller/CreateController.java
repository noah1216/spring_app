package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.RegisterForm;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

@Controller
@RequestMapping("/create")
public class CreateController {
	@Autowired
	private QuestionService questionsService;
	@Autowired
	private AnswerService answersService;

	@GetMapping
	String getRegister(@Validated @ModelAttribute("registerForm") RegisterForm registerForm, BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		return "create";
	}

	@PostMapping
	String postRegister(@ModelAttribute RegisterForm registerForm) {
		//　フォームから値を取り出す
		String question = registerForm.getQuestion();
		String answer = registerForm.getAnswer();

		if (question == null && answer == null) {
			return "register";
		}
		//サービスを利用して保存
		questionsService.create(question);
		//　question入力値と等しいレコードのidを取得しquestions_idとして変数宣言
		Question question_db = questionsService.findQuestion(question);
		int question_id = question_db.getId();
		answersService.create(answer, question_id);

		return "top";
	}

}
