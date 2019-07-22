package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.iktpreobuka.ednevnik.enumerations.EClass;

@Entity
public class ClassEntity {
	@Id
	private Integer classId;
	@Autowired
	private ClassYearEntity classYearEntity;
	private EClass eclass;
	

}
