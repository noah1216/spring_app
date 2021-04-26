package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

//Spring Securityの設定を変更するために、設定用のConfigクラスがここ。
//「WebSecurityConfigurerAdapter」という抽象クラスを継承する必要あり。

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//ここに設定情報を定義していく
	
	@Override 
	protected void configure(HttpSecurity http) throws Exception { 
	  http.authorizeRequests()
	  						.antMatchers("/login").permitAll()    // 誰でもアクセス可能
	  						 //上記以外は直リンク禁止
	  		                .anyRequest().authenticated()
	  		            .and()
	  		            .formLogin()
	  		        //ログイン処理のパス
	  	                .loginProcessingUrl("/login")
	  	                //ログインページ
	  	                .loginPage("/login")
	  	                //ログインエラー時の遷移先 ※パラメーターに「error」を付与
	  	                .failureUrl("/login?error")
	  	                //ログイン成功時の遷移先
	  	                .defaultSuccessUrl("/menu", true)
	  	                //ログイン時のキー：名前
	  	                .usernameParameter("name")
	  	                //ログイン時のパスワード
	  	                .passwordParameter("password")
	  	            .and()
	  	            .logout()
	  	                //ログアウト時の遷移先 POSTでアクセス
	  	                .logoutSuccessUrl("/login");
	}
	
    //パスワードのアルゴリズムをBCryptに設定
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	// CSSについて　特定の静的リソースについては認証なしで認可
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/webjars/**", "/css/**");
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

