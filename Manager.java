package com.hiber.model;
import javax.persistence.*;
@Entity
//@DiscriminatorValue("mang")
@Table(name="mgrs_only")
public class Manager extends Emp {
	@Column(name="allow")
	private double allowance;
	public Manager() {
		
	}

	public Manager(long eid, String eName, double basic, double allowance) {
		super(eid,eName,basic);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

}
