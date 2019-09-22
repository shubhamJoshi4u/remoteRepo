package com.odd.jobs.oddjobs.appsecurity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.odd.jobs.oddjobs.models.UserModel;
import com.odd.jobs.oddjobs.service.UserService;


@Service
public class UserDetailsSecurityService implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<UserModel> user = userService.findUserByUserName(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
		
		return new UserDetailsSecurity(user.get());
	}

}
