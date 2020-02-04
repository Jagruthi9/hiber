package com.hiber.model;
import javax.persistence.*;
@Entity
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("emp")*/
/*@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="BaseEmps")*/
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="Emps2")
public class Emp {
	@Id
	@Column(name="eid")
private long eid;
	@Column(name="ename")
private String eName;
	@Column(name="basic")
private double basic;

public Emp() {
}

public Emp(long eid, String eName, double basic) {
	super();
	this.eid = eid;
	this.eName = eName;
	this.basic = basic;
}

public long getEid() {
	return eid;
}

public void setEid(long eid) {
	this.eid = eid;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public double getBasic() {
	return basic;
}

public void setBasic(double basic) {
	this.basic = basic;
}

}