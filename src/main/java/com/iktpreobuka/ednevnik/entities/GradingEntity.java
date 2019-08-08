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
@Table(name = "Grading")
public class GradingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer gradingEntityId;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "grade")
	private GradeEntity grade;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher")
	private TeacherEntity teacher;
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "subject")
	private SubjectEntity subject;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "student")
	private StudentEntity student;
	
	public GradingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradingEntity(Integer gradingEntityId, GradeEntity grade, TeacherEntity teacher, SubjectEntity subject,
			StudentEntity student) {
		super();
		this.gradingEntityId = gradingEntityId;
		this.grade = grade;
		this.teacher = teacher;
		this.subject = subject;
		this.student = student;
	}





	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public Integer getGradingEntityId() {
		return gradingEntityId;
	}

	public void setGradingEntityId(Integer gradingEntityId) {
		this.gradingEntityId = gradingEntityId;
	}

	public GradeEntity getGrade() {
		return grade;
	}

	public void setGrade(GradeEntity grade) {
		this.grade = grade;
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
	
	

}
