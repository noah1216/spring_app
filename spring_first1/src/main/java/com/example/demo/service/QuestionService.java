package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Question;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository repository;

	//全権取得
	public List<Question> findAll() {
		return repository.findAll();
	}

	//questionカラムを参照し、一件の取得
	public Question findQuestion(String question) {
		return repository.findByQuestionEquals(question);
	}

	//idカラムを参照し、一件の取得
	public Question findId(int question_id) {
		return repository.findById(question_id);
	}

	//一件の保存
	public Question create(String question) {
		//　エンティティ変数作成
		Question questions = new Question();
		//　受け取った値をエンティティにセットする
		questions.setQuestion(question);
		// 保存
		return repository.save(questions);
	}

	//　削除
	public void delete(int id) {
		repository.deleteById(id);
	}
}
