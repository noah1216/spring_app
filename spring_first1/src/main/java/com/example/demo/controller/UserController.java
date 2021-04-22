package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.UserRepository;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<com.example.demo.entity.User> userlist=userRepository.findAll();
        model.addAttribute("userlist", userlist);
        return "index";
    }
}