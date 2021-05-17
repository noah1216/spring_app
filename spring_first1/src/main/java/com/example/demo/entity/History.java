package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "histories")
public class History {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "users_id")
	private int userId;

	@Column(name = "point")
	private int point;

	@Column(name = "created_at")
	private Timestamp createdAt;
}
