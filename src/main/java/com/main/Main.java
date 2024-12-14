package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Main {


	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e = (Employee)ioc.getBean("emp");
		Employee e2 = (Employee)ioc.getBean("emp2");
		
		System.out.println(e);
		
		System.out.println(e2);
	}

}
