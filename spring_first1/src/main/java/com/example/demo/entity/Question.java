package com.example.demo.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "questions")

public class Question {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "question")
	private String question;

	@Column(name = "updated_at")
	private Timestamp updated_at;

	@Column(name = "created_at")
	private Timestamp created_at;

}
