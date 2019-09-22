package com.odd.jobs.oddjobs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odd.jobs.oddjobs.models.UserModel;
import com.odd.jobs.oddjobs.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserModel saveUser(UserModel user) {
	
		return userRepository.save(user);
		
	}
	
	public Optional<UserModel> findUserByUserName (String userName) {
	
		return userRepository.findByUserName(userName);
		
	}
	
}
