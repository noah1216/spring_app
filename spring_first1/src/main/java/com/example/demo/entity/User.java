package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * ユーザー情報 Entity
 */
@Entity
@Table(name="users")
public class User {

	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="deleteflag")
	private int deleteflag;
	
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String empname) {
        this.name = empname;
    }
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(int deleteflag) {
		this.deleteflag = deleteflag;
	}


}