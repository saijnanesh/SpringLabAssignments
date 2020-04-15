package com.cpg.springframeworklab1.dto;

public class EmployeeDTO {
	
    private int employeeId;
    private String employeeName;
    private double salary;
    private SBU businessUnit;
    private int age;
    
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	
	public void getSBUDetails()
	{
		System.out.println("EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + "]");
	}
	
    
}
