package com.myproject.daotest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.myproject.beans.User;
import com.myproject.dao.DaoException;
import com.myproject.dao.DaoFactory;

public class AdminGetLoginAndPasw {

		private static User admin;
		
		@BeforeClass
		public static void init(){
			admin = new User();
			admin.setId(1);
			admin.setLogin("Admin");
			admin.setPassword("1");
	}
		@Test
		public void getLoginAndPasw() throws DaoException{
			DaoFactory.getUserDao().getByLoginAndPassword(admin.getLogin(), admin.getPassword());
		}

}
