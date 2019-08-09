package com.iktpreobuka.ednevnik.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO {
	@NotNull(message="must be filled")
	@Size(min=2, max=30, message="must be within {min} and {max} number of characters")
	private String name;
	@NotNull(message="must be filled")
	@Size(min=2, max=30, message="must be within {min} and {max} number of characters")
	private String lastName;
	@NotNull(message="must be filled")
	@Pattern(regexp="^[_A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
	message="mail not valid")
	private String email;
	@NotNull(message="must be filled")
	@Size(min=5, max=15, message="must be within {min} and {max} number of characters")
	private String username;
	@NotNull(message="must be filled")
	@Size(min=5, max=10, message="must be within {min} and {max} number of characters")
	private String password;
	@NotNull(message="must be filled")
	@Min(value=18, message="must be minimum 18 years old")
	private String confirmedPassword;
	
	
	UserDTO(){}

	public UserDTO(
			String name,
			 String lastName,
			 String email,
			 String username,
			 String password,
			 String confirmedPassword) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmedPassword = confirmedPassword;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmedPassword() {
		return confirmedPassword;
	}

	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}

}
