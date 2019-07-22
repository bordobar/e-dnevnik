package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.iktpreobuka.ednevnik.enumerations.Grade;

@Entity
public class GradeEntity {
	@Id
	private Integer gradeId;
	private Grade verbalExamGrade;
	private Grade writtenExamGrade;
	private Grade midtermGrade;
	private Grade finalGrade;

}
