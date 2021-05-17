package com.example.demo.controller;

import java.security.Timestamp;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;
import com.example.demo.controller.form.TestForm;
import com.example.demo.entity.Answer;
import com.example.demo.entity.History;
import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.HistoryService;
import com.example.demo.service.QuestionService;

@Controller
@RequestMapping("/test")

public class TestController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;
	@Autowired
	private HistoryService historyService;

	@Autowired
	HttpSession session;

	@GetMapping
	String getList(Model model, @ModelAttribute TestForm testForm) {
		List<Question> list = questionService.findAll();
		Collections.shuffle(list);

		model.addAttribute("questionList", list);

		return "test";
	}

	@PostMapping
	String postLogin(Model model, @ModelAttribute TestForm testForm, @ModelAttribute LoginForm loginForm) {
		if (session == null) {
			return "login";
		}

		// セッションからテストuserデータ取得
		String user_name = (String) session.getAttribute("login_name");
		int user_id = (int) session.getAttribute("login_id");

		model.addAttribute("user_name", user_name);
		model.addAttribute("user_id", user_id);

		// フォームでリストデータを受け取る
		String a = testForm.getAnswer();
		String[] answers = a.split(",");

		String q = testForm.getQuestionId();
		String[] questions = q.split(",");

		int point = 0;

		//　入力されたanswerを一つずつ取り出してdbのアンサーと照合させる
		for (int count = 0; count < answers.length; count++) {
			//　入力されたanswer
			String list_answer = answers[count];

			//　入力されたanswerの問題のidを取得
			String question_id = questions[count];
			//　idを下に紐付いたanswerを全てdbから取得する
			int id = Integer.parseInt(question_id);
			List<Answer> db_answers = answerService.findAnswer(id);

			//　取得したdbanswerを一つずつ照合させる
			for (int i = 0; i < db_answers.size(); i++) {
				Answer b = db_answers.get(i);
				String db_answer = b.getAnswer();
				System.out.println(db_answer);

				if (db_answer.equals(list_answer)) {
					// 答えが一致したらポイントに+1する
					point = point + 1;
				}
			}
		}
		//　.eq~で答えが一致したら点数にする
		model.addAttribute("point", point);

		// テスト結果保存
		historyService.create(point, user_id);

		//　問題数
		List<Question> totals = questionService.findAll();
		int total = totals.size();
		model.addAttribute("total", total);

		// 点数計算
		int sum = 100 / total;
		int score = sum * point;
		model.addAttribute("score", score);

		//　テスト時間
		History history = historyService.findHistory(user_id);
		Timestamp date = history.getCreatedAt();
		model.addAttribute("date", date);

		return "result";
	}

}
