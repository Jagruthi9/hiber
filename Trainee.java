package com.hiber.model;
import javax.persistence.*;
@Entity
@Table(name="Trainees")
public class Trainee implements Comparable<Trainee>{
	@Id
	private int admno;
	private String sName;
	@ManyToOne
	@JoinColumn(name="cid")
	private Course course;
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int admno, String sName, Course course) {
		super();
		this.admno = admno;
		this.sName = sName;
		this.course = course;
	}
	public int getAdmno() {
		return admno;
	}
	public void setAdmno(int admno) {
		this.admno = admno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
public int compareTo(Trainee o) {
	return(this.admno<o.admno?-1:(this.admno>o.admno?1:0));
}
}
