package com.iktpreobuka.ednevnik.controllers;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.ednevnik.DTO.UserDTO;
import com.iktpreobuka.ednevnik.entities.UserEntity;
import com.iktpreobuka.ednevnik.repositories.UserRepository;
import com.iktpreobuka.ednevnik.util.UserCustomValidator;



@RestController
@RequestMapping(path = "/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	UserCustomValidator userValidator;
	
	@InitBinder
	protected void initBinder(final WebDataBinder binder) {
		binder.addValidators(userValidator);
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> addNewUser(@Valid @RequestBody UserEntity newUser, BindingResult result){
	if(result.hasErrors()){
		return new ResponseEntity<>(createErrorMessage(result), HttpStatus.BAD_REQUEST);
	} else {
			userValidator.validate(newUser, result);
	}
		userRepository.save(newUser);
		UserEntity user = new UserEntity();
		user.setUserId(newUser.getUserId());
		user.setName(newUser.getName());
		user.setLastName(newUser.getLastName());
		user.setUsername(newUser.getUsername());
		user.setEmail(newUser.getEmail());
		user.setPassword(newUser.getPassword());
		user.setRole(newUser.getRole());
		
		userRepository.save(user);
		
		return new ResponseEntity<>(newUser,HttpStatus.OK);
	
	}

	private String createErrorMessage(BindingResult result) {
		return result.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(" "));
	}
	
	
	@Secured("ROLE_ADMIN")
	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public Iterable<UserEntity> getAllUsers() {
	return userRepository.findAll();
	}
	
	
	
	
}
