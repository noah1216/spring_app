package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity //エンティティクラスのアノテーション
@Getter //Getterの自動生成のアノテーション
@Setter //Setterの自動生成のアノテーション
@Table(name="users") //テーブル名の指定
public class User{
	@Id //idであることをアノテーションで明示する
	@Column(name="id") //DB上のカラム名を指定する
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="password")
	private String password;

	@Column(name="deleteflag")
	private int deleteflag;

	@Column(name="updated_at")
	private Date updated_at;

	@Column(name="created_at")
	private Date created_at;
	
	@Column(name="deleted_at")
	private Date deleted_at;
	
}