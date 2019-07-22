package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class GradingEntity {
	@Id
	private Integer gradingEntityId;
	@Autowired
	private GradeEntity grade;
	@Autowired
	private TeacherEntity teacher;
	@Autowired
	private SubjectEntity subject;
	

}
