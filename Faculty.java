package com.hiber.composition;
import javax.persistence.*;
@Entity
@Table(name="faculty")
public class Faculty {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long factId;
  private String factName;
  @Embedded
  private Address  address;
  public Faculty() {
	  
  }
public Faculty( String factName, Address address) {
	super();
	this.factName = factName;
	this.address = address;
}

public String getFactName() {
	return factName;
}
public void setFactName(String factName) {
	this.factName = factName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
  
}
