
//this update after 1st commit.........
//syso("hello");dfsdf
package com.psl.training.bean;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employee {


	private static void mymethod (){
		System.out.println("ha ha ");
	}
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public Employee(int empId, String empName, String city, int salary,
			String dept, Date hireDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
		this.dept = dept;
		this.hireDate = hireDate;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	private String empName;
	private String city;
	private int salary;
	private String dept;
	private Date hireDate;

	public Employee() {

	}
}