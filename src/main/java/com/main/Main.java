package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Main {


	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e = ioc.getBean(Employee.class, "emp");
		
		System.out.println(e);
	}

}