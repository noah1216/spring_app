package com.example.demo.service;

import java.sql.Timestamp;
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

	public History create(int point, int user_id, Timestamp timestamp) {
		//　エンティティ変数作成
		History histories = new History();
		//　受け取った値をエンティティにセットする
		histories.setPoint(point);
		histories.setUserId(user_id);
		histories.setCreatedAt(timestamp);

		// 保存
		return repository.save(histories);
	}

	//questionカラムを参照し、一件の取得
	public List<History> findHistory(int user_id) {
		return repository.findByUserIdEquals(user_id);
		//		return repository.findByUserIdEquals(user_id);
	}

}
