package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;
import com.example.demo.entity.History;
import com.example.demo.service.HistoryService;

@Controller

@RequestMapping("/history")
public class HistoryController {

	@Autowired
	HttpSession session;

	@Autowired
	private HistoryService historyService;

	@GetMapping
	String getList(Model model, @ModelAttribute LoginForm loginForm) {
		Integer user_id = (Integer) session.getAttribute("login_id");
		if (user_id == null) {
			return "login";
		}
		// セッションからテストuserデータ取得
		String user_name = (String) session.getAttribute("login_name");
		model.addAttribute("user_name", user_name);

		List<History> list = historyService.findHistory(user_id);
		model.addAttribute("histories", list);

		return "history";
	}

}
