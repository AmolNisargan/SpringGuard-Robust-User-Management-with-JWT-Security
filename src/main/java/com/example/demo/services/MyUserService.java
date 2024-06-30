package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.AuthenticationRequest;
import com.example.demo.repository.UserRepository;

@Service
public class MyUserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// Fetching user details from the database using UserRepository
		AuthenticationRequest details = userRepository.findByUsername(userName);
		if (details == null) {
			// Throwing exception if user not found
			throw new UsernameNotFoundException("User not found");
		}
		// Returning UserDetails object with username and encoded password
		String name = details.getUsername();
		String password = details.getPassword();
		return new User(name, password, new ArrayList<>());
	}
}
