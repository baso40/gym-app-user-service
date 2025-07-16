package com.advgym.user_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.advgym.user_service.dto.UserRegistrationDto;
import com.advgym.user_service.dto.UserResponseDto;
import com.advgym.user_service.entity.User;
import com.advgym.user_service.exception.UserAlreadyExistsException;
import com.advgym.user_service.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	
	
	//user register
	public UserResponseDto register(UserRegistrationDto request) throws UserAlreadyExistsException {
		
		Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
			throw new UserAlreadyExistsException("user with email "+user.getEmail()+" already exists");
		}
		
		
		
		
		return null;
	}
	//login user
	//get user by id
	//get user by email
	//get all user
	//get user by status
	//update user 
	//delete user
	//activate user
	//suspend user
	//search user
	//get user count
	//get active user count

}
