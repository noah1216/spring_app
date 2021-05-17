package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {

	List<History> findByUserIdEquals(int user_id);

}
