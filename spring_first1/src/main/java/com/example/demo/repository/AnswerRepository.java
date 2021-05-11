package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	List<Answer> findByQuestions_idEquals(int questions_id);
}
