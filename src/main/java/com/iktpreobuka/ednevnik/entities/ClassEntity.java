package com.iktpreobuka.ednevnik.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iktpreobuka.ednevnik.enumerations.ClassYear;
import com.iktpreobuka.ednevnik.enumerations.EClass;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ClassEntity extends ClassYearEntity {

	private EClass eclass;
	
	@JsonIgnore
	@OneToMany(mappedBy = "classEntity", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<TeachingEntity> teachings = new ArrayList<>();

	public ClassEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassEntity(Integer classYearId, ClassYear classYear) {
		super(classYearId, classYear);
		// TODO Auto-generated constructor stub
	}

	public ClassEntity(EClass eclass, List<TeachingEntity> teachings) {
		super();
		this.eclass = eclass;
		this.teachings = teachings;
	}

	public List<TeachingEntity> getTeachings() {
		return teachings;
	}



	public void setTeachings(List<TeachingEntity> teachings) {
		this.teachings = teachings;
	}



	public EClass getEclass() {
		return eclass;
	}

	public void setEclass(EClass eclass) {
		this.eclass = eclass;
	}
	
	
}
