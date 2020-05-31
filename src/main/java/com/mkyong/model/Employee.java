package com.mkyong.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class Employee {
	
	private int empId;
	private String empName;
	private Long empSal;
	private String empMobile;

	@XmlElement(name = "empId")
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@XmlElement(name = "empName")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@XmlElement(name = "empSal")
	public Long getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Long empSal) {
		this.empSal = empSal;
	}
	
	@XmlElement(name = "empMobile")
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	

}
