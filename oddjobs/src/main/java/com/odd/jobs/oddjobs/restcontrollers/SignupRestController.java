package com.odd.jobs.oddjobs.restcontrollers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.odd.jobs.oddjobs.models.UserModel;
import com.odd.jobs.oddjobs.responsemodels.ResponseTemplate;
import com.odd.jobs.oddjobs.service.UserService;

@RestController
public class SignupRestController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/signupService")
	public ResponseEntity <ResponseTemplate> userSignup(@Valid @RequestBody UserModel user) {
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setUserState("ACTIVE");
		user.setAccountStatus("Unlocked");
		
		userService.saveUser(user);
		
		ResponseTemplate response = new ResponseTemplate();
		response.setStatus("Transaction Successful");
		response.setMessage("User account was successfully Created");
		
		return  ResponseEntity.ok().body(response);
	}
	
}
