package com.cpg.springframeworklab1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpg.springframeworklab1.dto.EmployeeDTO;

public class Client {

	public static void main(String[] args) {
	

		ApplicationContext apc=new ClassPathXmlApplicationContext("EmployeeBean.xml");
		
		EmployeeDTO emp=apc.getBean("aravindEmployeeObject", EmployeeDTO.class);
		
	    emp.getSBUDetails();
		((ClassPathXmlApplicationContext)apc).close();
		
	}

}
