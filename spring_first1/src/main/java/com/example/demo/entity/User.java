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
    @Column(name="empno")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	private int deleteflag;
	
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmpname() {
        return name;
    }
    public void setEmpname(String empname) {
        this.name = empname;
    }
    public String getPassword() {
		//パスワードを返す
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDeleteFlag() {
		//deleteflagを返す
		return deleteflag;
	}

	public void setDeleteflag(int deleteflag) {
		this.deleteflag = deleteflag;
	}


}