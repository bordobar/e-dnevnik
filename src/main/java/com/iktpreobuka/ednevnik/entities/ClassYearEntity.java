package com.iktpreobuka.ednevnik.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.iktpreobuka.ednevnik.enumerations.ClassYear;
import com.iktpreobuka.ednevnik.enumerations.EClass;

@Entity
public class ClassYearEntity {
	@Id
	private Integer classYearId;
	private ClassYear classYear;
	private EClass eClass;

}
