package com.myproject.daotest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.myproject.beans.Admin;
import com.myproject.dao.DaoException;
import com.myproject.dao.DaoFactory;

public class AdminGetLoginAndPasw {

		private static Admin admin;
		
		@BeforeClass
		public static void init(){
			admin = new Admin();
			admin.setId(1);
			admin.setLogin("Admin");
			admin.setPassword("1");
	}
		@Test
		public void getLoginAndPasw() throws DaoException{
			DaoFactory.getAdminDao().getByLoginAndPassword(admin.getLogin(), admin.getPassword());
		}

}
