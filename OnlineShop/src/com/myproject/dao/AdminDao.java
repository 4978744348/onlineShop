package com.myproject.dao;

import java.util.List;

import com.myproject.beans.Admin;

public interface AdminDao {

	List<Admin> getAll() throws DaoException;
	
	Admin getByLoginAndPassword(String login, String password) throws DaoException;
	

}
