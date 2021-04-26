package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserService{
   //ユーザーテーブルの取得用repositoryのインスタンス生成
	@Autowired  //オートワイヤリング設定(DIコンテナから型が一致するものを取り出しインジェクションする)
    private UserRepository userRepository;

   //与えられたユーザー名を用いてUserDetailsを取得し返却するメソッド
   
}