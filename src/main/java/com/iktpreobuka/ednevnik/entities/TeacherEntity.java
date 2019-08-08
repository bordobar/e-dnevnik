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


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "Teacher")
public class TeacherEntity extends UserEntity {
	
	@JsonIgnore
	@OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<TeachingEntity> teachings = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<GradingEntity> grades = new ArrayList<>();
	
	public TeacherEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherEntity(Integer userId, String name, String lastName, String email, String username, String password,
			RoleEntity role) {
		super(userId, name, lastName, email, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public TeacherEntity(List<TeachingEntity> teachings, List<GradingEntity> grades) {
		super();
		this.teachings = teachings;
		this.grades = grades;
	}

	public List<GradingEntity> getGrades() {
		return grades;
	}

	public void setGrades(List<GradingEntity> grades) {
		this.grades = grades;
	}

	public List<TeachingEntity> getTeachings() {
		return teachings;
	}

	public void setTeachings(List<TeachingEntity> teachings) {
		this.teachings = teachings;
	}

	

	

	
	
}
