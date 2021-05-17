package com.example.demo.controller;

import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller

@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserService userService;

	@Autowired
	HttpSession session;

	//    GETメソッド
	@GetMapping
	String getLogin(@ModelAttribute LoginForm logiForm) {
		return "login";
	}

	//　　POSTメソッド
	@PostMapping
	String postLogin(@ModelAttribute LoginForm loginForm, Model model) {
		//    	    System.out.println(loginForm.getName());
		//    	    System.out.println(loginForm.getPassword());
		// ユーザーの確認

		// dbからデータを検索
		User user = userService.getUser(loginForm.getName(), loginForm.getPassword());
		//    	    System.out.println("UserName"+ user.getName());
		//    	    System.out.println("UserId"+ user.getId());

		//　dbになかったときのリダイレクト
		if (Objects.isNull(user)) {
			return "login";
		}

		//セッションにデータ追加

		String db_name = user.getName();
		String db_pw = user.getPassword();
		int db_id = user.getId();

		session.setAttribute("login_id", db_id);
		session.setAttribute("login_name", db_name);
		session.setAttribute("login_pw", db_pw);

		String user_name = (String) session.getAttribute("login_name");
		int user_id = (int) session.getAttribute("login_id");

		//			System.out.println(data);

		//画面遷移
		return "top";
	}

}