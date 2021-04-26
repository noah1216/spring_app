package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

//Spring Securityの設定を変更するために、設定用のConfigクラスがここ。
//「WebSecurityConfigurerAdapter」という抽象クラスを継承する必要あり。

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//ここに設定情報を定義していく
	
	@Override 
	protected void configure(HttpSecurity http) throws Exception { 
	  http.authorizeRequests().antMatchers("/login").permitAll()    // 誰でもアクセス可能
	                          .antMatchers("/admin").hasRole("ADMIN") // admin権限持ちのみが/adminに遷移可能
	                          .anyRequest().authenticated() // その他のページには誰でも入れるよ記述
	       .and().formLogin() 
	       .and().httpBasic(); 
	}
	
	// CSSについて　特定の静的リソースについては認証なしで認可
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/css/**");
	}
	
	
	//　認証時（BASIC認証）のパス設定 & ハッシュ化
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	  auth.inMemoryAuthentication()
	      .withUser("user").password(encoder.encode("123456")).roles("USER")
	      .and()
	      .withUser("admin").password(encoder.encode("adminpassword")).roles("ADMIN");
	}
}

