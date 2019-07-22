package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ParentEntity {
	@Id
	private Integer parentId;
	private String name;
	private String lastName;
	private String email;
	
	@Autowired
	private UserEntity userEntity;
	

}
