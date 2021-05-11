package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Answer;
import com.example.demo.repository.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	AnswerRepository repository;

	//全権取得
	public List<Answer> findAll() {
		return repository.findAll();
	}

	//一件の保存
	public void create(String answer, int question_id) {
		//　エンティティ変数作成
		Answer answers = new Answer();
		//　受け取った値をエンティティにセットする
		answers.setAnswer(answer);
		answers.setQuestions_id(question_id);
		// 保存
		repository.save(answers);
	}

	//　questionに紐付いたanswerを取得
	public List<Answer> findAnswer(Integer question_id) {
		return repository.findByQuestions_idEquals(question_id);
	}
}