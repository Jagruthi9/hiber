package com.hiber.model;
import javax.persistence.*;
@Entity
//@DiscriminatorValue("cemp")
@Table(name="cemps_only")
public class ContractEmp extends Emp {
	@Column(name="dur")
	private int duration;
	public ContractEmp() {
		
	}

	public ContractEmp(long eid, String eName, double basic,int duration) {
		super(eid,eName,basic);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
