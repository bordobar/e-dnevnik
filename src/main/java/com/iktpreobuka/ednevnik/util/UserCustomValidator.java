package com.iktpreobuka.ednevnik.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.iktpreobuka.ednevnik.DTO.UserDTO;



@Component
public class UserCustomValidator implements Validator{
	
	@Override
	public boolean supports (Class<?> myClass) {
		return UserDTO.class.equals(myClass);
	}
	
	@Override
	public void validate(Object target, Errors error) {
		UserDTO user = (UserDTO) target;
		if(!user.getPassword().equals(user.getConfirmedPassword())){
			error.reject("400","Password must be same");
			
		}
	}
	
	

}
