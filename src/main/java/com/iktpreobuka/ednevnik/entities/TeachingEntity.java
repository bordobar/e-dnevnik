package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class TeachingEntity {
	@Id
	private Integer teachingEntityId;
	@Autowired
	private TeacherEntity teacher;
	@Autowired
	private SubjectEntity subject;
	@Autowired
	private ClassEntity classEntity;
	

}
