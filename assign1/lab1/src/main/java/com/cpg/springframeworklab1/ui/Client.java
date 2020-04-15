package com.cpg.springframeworklab1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpg.springframeworklab1.dto.EmployeeDTO;
import com.cpg.springframeworklab1.dto.SBU;

public class Client {

	public static void main(String[] args) {
	

		ApplicationContext apc=new ClassPathXmlApplicationContext("EmployeeBean.xml");
		
		SBU sbu=apc.getBean("aravindSBUObject",SBU.class);
		System.out.println(sbu);
		
		
		((ClassPathXmlApplicationContext)apc).close();
		
	}

}
