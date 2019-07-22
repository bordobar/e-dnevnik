package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.iktpreobuka.ednevnik.enumerations.EUserRole;

@Entity
public class UserEntity {
	@Id
	private Integer userId;
	private String username;
	private String password;
	private EUserRole role;
	
	
}
