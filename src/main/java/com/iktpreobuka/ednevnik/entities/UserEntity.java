package com.iktpreobuka.ednevnik.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "User")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String name;
	private String lastName;
	private String username;
	@Column (name ="password")
	@JsonIgnore
	private String password;
	@Column(name="email")
	private String email;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "role")
	private RoleEntity role;
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(Integer userId, String name, String lastName, String email, String username, String password,
			RoleEntity role) {
		super();
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	
	
	
}
