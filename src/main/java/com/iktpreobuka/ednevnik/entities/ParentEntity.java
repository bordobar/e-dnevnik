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
@Table(name = "Parent")
public class ParentEntity extends UserEntity{
	@JsonIgnore
	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<StudentEntity> child = new ArrayList<>();

	public ParentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ParentEntity(Integer userId, String name, String lastName, String email, String username, String password,
			RoleEntity role) {
		super(userId, name, lastName, email, username, password, role);
		// TODO Auto-generated constructor stub
	}


	public ParentEntity(List<StudentEntity> child) {
		super();
		this.child = child;
	}

	public List<StudentEntity> getChild() {
		return child;
	}

	public void setChild(List<StudentEntity> child) {
		this.child = child;
	}


	
	
}
