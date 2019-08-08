package com.iktpreobuka.ednevnik.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "Student")
public class StudentEntity extends UserEntity {
	
	@JsonIgnore
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<GradingEntity> grades = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<TeachingEntity> teachings = new ArrayList<>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "parent")
	private ParentEntity parent;
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public StudentEntity(Integer userId, String name, String lastName, String email, String username, String password,
			RoleEntity role) {
		super(userId, name, lastName, email, username, password, role);
		// TODO Auto-generated constructor stub
	}


	public StudentEntity(List<GradingEntity> grades, List<TeachingEntity> teachings) {
		super();
		this.grades = grades;
		this.teachings = teachings;
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
