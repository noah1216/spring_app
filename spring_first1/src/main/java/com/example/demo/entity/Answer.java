package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
@Table(name="correct_answers")
public class Answer {
	@Id
	@Column(name="id")
	private int id;

	@Column(name="questions_id")
	private int questions_id;
	
	@Column(name="answer")
	private String answer;

	@Column(name="updated_at")
	private Date updated_at;

	@Column(name="created_at")
	private Date created_at;
	
}
