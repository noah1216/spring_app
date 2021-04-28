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
}