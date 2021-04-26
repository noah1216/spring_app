package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * ユーザー情報 Entity
 */
@Entity 
//エンティティクラスのアノテーション
@Table(name="users")
//テーブル名の指定
public class User implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	//権限は一般ユーザ、マネージャ、システム管理者の３種類とする
    public enum Authority {ROLE_USER,ROLE_MANAGER, ROLE_ADMIN}

	@Id
    @Column(name="id")
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable = false, unique = true)
	private String name;
	
	@Column(name="password",nullable = false)
	private String password;
	
	@Column(name="deleteflag")
	private int deleteflag;
	
	
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Set<Authority> authorities;

 // JPA requirement
    protected void Account() {}
	
    //コンストラクタ
    public void Account(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.authorities = EnumSet.of(Authority.ROLE_USER);
    }
    
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String empname) {
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
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		List<GrantedAuthority> authorities = new ArrayList<>();
        for (Authority authority : this.authorities) {
            authorities.add(new SimpleGrantedAuthority(authority.toString()));
        }
        return authorities;
	}
	@Override
	public String getUsername() {
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}


}