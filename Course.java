package com.hiber.model;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="Courses")
public class Course {
	@Id
	private int cId;
	private String cName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="course")
	private Set<Trainee>trainees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Course(int cId, String cName, Set<Trainee> trainees) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.trainees = trainees;
	}


	public Set<Trainee> getTrainees() {
		return trainees;
	}


	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}


	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
}
