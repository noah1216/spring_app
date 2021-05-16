package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.History;
import com.example.demo.repository.HistoryRepository;

@Service
public class HistoryService {

	@Autowired
	HistoryRepository repository;

	public List<History> findAll() {
		return repository.findAll();
	}

	public History create(String point, int user_id) {
		//　エンティティ変数作成
		History histories = new History();
		//　受け取った値をエンティティにセットする
		histories.setPoint(point);
		histories.setUserId(user_id);

		// 保存
		return repository.save(histories);
	}
}
