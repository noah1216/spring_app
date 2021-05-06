package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	//　questionと同じデータを持つレコードを取得する
	Question findByQuestionEquals(String question);

	// id を参照、取得
	Question findById(int id);
}
