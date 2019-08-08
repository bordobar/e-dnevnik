package com.iktpreobuka.ednevnik.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iktpreobuka.ednevnik.enumerations.Grade;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "Grade")
public class GradeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gradeId;
	private Grade verbalExamGrade;
	private Grade writtenExamGrade;
	private Grade midtermGrade;
	private Grade finalGrade;
		
	@JsonIgnore
	@OneToMany(mappedBy = "grade", fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	private List<GradingEntity> grades = new ArrayList<>();
	
	public GradeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GradeEntity(Integer gradeId, Grade verbalExamGrade, Grade writtenExamGrade, Grade midtermGrade,
			Grade finalGrade, List<GradingEntity> grades) {
		super();
		this.gradeId = gradeId;
		this.verbalExamGrade = verbalExamGrade;
		this.writtenExamGrade = writtenExamGrade;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
		this.grades = grades;
	}



	public List<GradingEntity> getGrades() {
		return grades;
	}



	public void setGrades(List<GradingEntity> grades) {
		this.grades = grades;
	}



	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Grade getVerbalExamGrade() {
		return verbalExamGrade;
	}

	public void setVerbalExamGrade(Grade verbalExamGrade) {
		this.verbalExamGrade = verbalExamGrade;
	}

	public Grade getWrittenExamGrade() {
		return writtenExamGrade;
	}

	public void setWrittenExamGrade(Grade writtenExamGrade) {
		this.writtenExamGrade = writtenExamGrade;
	}

	public Grade getMidtermGrade() {
		return midtermGrade;
	}

	public void setMidtermGrade(Grade midtermGrade) {
		this.midtermGrade = midtermGrade;
	}

	public Grade getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(Grade finalGrade) {
		this.finalGrade = finalGrade;
	}
	
	

}
