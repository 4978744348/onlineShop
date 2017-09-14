package com.myproject.dao;

import java.util.List;


import com.myproject.beans.User;

public interface UserDao {

	List<User> getAll() throws DaoException;
	
	User getByLoginAndPassword(String login, String password) throws DaoException;
	

}
