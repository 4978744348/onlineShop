package com.myproject.daotest;

import org.junit.Test;

import com.myproject.dao.DaoException;
import com.myproject.dao.DaoFactory;

public class AdminGetAll {
	
	@Test
	public void getAll() throws DaoException{
		DaoFactory.getUserDao().getAll();
	}

}
