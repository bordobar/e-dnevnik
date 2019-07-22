package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class SubjectEntity {
	@Id
	private Integer subjectId;
	private String name;
	private Integer weekFund;
	@Autowired
	private ClassYearEntity classYear;

}
