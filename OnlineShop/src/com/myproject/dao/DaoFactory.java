package com.myproject.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoFactory {
	
	 private static final ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("spring-dao.xml");
	 
	 public static AdminDao getAdminDao(){
		return (AdminDao) CONTEXT.getBean("adminDao");
		 
	 }

}
