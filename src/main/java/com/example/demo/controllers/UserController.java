package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi";
	}
	
	
	@RequestMapping("/create")
	public String create(@RequestParam String name, @RequestParam String password, @RequestParam String address) {
		User user= service.create(name, password, address);
		return user.toString();
	}
	
	@RequestMapping("/find")
	public User findone(@RequestParam String name) {
		 return service.findByFirstName(name);
		
	}
}
