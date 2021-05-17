package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {

	History findByUserIdEquals(int user_id);

}
