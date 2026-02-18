package com.ly.hostel.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.ly.hostel.repository.AuthUserRepository;

@Component
public class CustomUserDetailService implements UserDetailsService{
	
	private final AuthUserRepository authUserRepository;
	
	public CustomUserDetailService(AuthUserRepository auth) {
		this.authUserRepository=auth;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return authUserRepository.findByUsername(username).map(
				CustomUserDetails::new).orElseThrow(); 
				
	}

}
