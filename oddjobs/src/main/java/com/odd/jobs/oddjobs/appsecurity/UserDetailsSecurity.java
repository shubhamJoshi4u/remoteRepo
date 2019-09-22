package com.odd.jobs.oddjobs.appsecurity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.odd.jobs.oddjobs.models.UserModel;

public class UserDetailsSecurity implements UserDetails {
		
	private UserModel user; 
	private List<GrantedAuthority> authorities;

	public UserDetailsSecurity (UserModel userModel) {
		this.user = userModel;
		this.authorities = userModel.getRole().
							stream().map(SimpleGrantedAuthority::new).
							collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return user.getUserState().contains("Active");
	}

	@Override
	public boolean isAccountNonLocked() {
		return user.getAccountStatus().contains("Unlocked");
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
