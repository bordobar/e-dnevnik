package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class StudentEntity {
	@Id
	private Integer studentId;
	private String name;
	private String lastName;
	@Autowired
	private UserEntity user;
	@Autowired
	private ParentEntity parent;
	

}
