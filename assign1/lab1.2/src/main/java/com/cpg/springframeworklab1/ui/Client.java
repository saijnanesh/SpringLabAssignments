package com.cpg.springframeworklab1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpg.springframeworklab1.dto.EmployeeDTO;

public class Client {

	public static void main(String[] args) {
	

		ApplicationContext apc=new ClassPathXmlApplicationContext("EmployeeBean.xml");
		
		EmployeeDTO emp=apc.getBean("aravindEmployeeObject", EmployeeDTO.class);
		
		System.out.println("Employee ID:"+emp.getEmployeeId());
		System.out.println("Employee Name:"+emp.getEmployeeName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee BU:"+emp.getBusinessUnit());
		System.out.println("Employee Age:"+emp.getAge());
		
		((ClassPathXmlApplicationContext)apc).close();
		
	}

}
