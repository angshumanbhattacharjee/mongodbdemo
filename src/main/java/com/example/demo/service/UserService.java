package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User create(String name, String password, String address) {
		return repo.save(new User(name,password,address));
		
	}
	
	public User findByFirstName(String name) {
		return repo.findByName(name);
	}
}
