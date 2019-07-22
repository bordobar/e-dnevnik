package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class TeacherEntity {
	@Id
	private Integer teacherId;
	private String name;
	private String lastName;
	@Autowired
	private UserEntity user;

}
