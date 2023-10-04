package com.training.java;

public class Employee {

	public Employee(String name, double sal) {
		this.employeeName = name;
		this.salary = sal;
	}
	
	
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	public String employeeName;
	public double salary;
}
