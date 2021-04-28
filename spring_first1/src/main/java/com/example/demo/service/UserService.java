package com.example.demo.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService{
	@Autowired  //オートワイヤリング設定(DIコンテナから型が一致するものを取り出しインジェクションする)
    private UserRepository userRepository;

   public User getUser(String name, String password) {
	User user = userRepository.findByNameAndPassword(name, password);
	return user;
   }
   
}