package com.iktpreobuka.ednevnik.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "Teaching")
public class TeachingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teachingEntityId;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher")
	private TeacherEntity teacher;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject")
	private SubjectEntity subject;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "classEntity")
	private ClassEntity classEntity;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "student")
	private StudentEntity student;
	
	public TeachingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeachingEntity(Integer teachingEntityId, TeacherEntity teacher, SubjectEntity subject,
			ClassEntity classEntity, StudentEntity student) {
		super();
		this.teachingEntityId = teachingEntityId;
		this.teacher = teacher;
		this.subject = subject;
		this.classEntity = classEntity;
		this.student = student;
	}



	public Integer getTeachingEntityId() {
		return teachingEntityId;
	}

	public void setTeachingEntityId(Integer teachingEntityId) {
		this.teachingEntityId = teachingEntityId;
	}

	public TeacherEntity getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherEntity teacher) {
		this.teacher = teacher;
	}

	public SubjectEntity getSubject() {
		return subject;
	}

	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}

	public ClassEntity getClassEntity() {
		return classEntity;
	}

	public void setClassEntity(ClassEntity classEntity) {
		this.classEntity = classEntity;
	}
	
	
	
}
