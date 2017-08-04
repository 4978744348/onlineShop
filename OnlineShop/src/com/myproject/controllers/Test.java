package com.myproject.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private String mes;
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
		Test test = (Test) context.getBean("test");
		System.out.println(test.mes);
		
	}
	
	

}
