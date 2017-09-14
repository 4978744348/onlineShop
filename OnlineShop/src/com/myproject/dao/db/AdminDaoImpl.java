package com.myproject.dao.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.myproject.dao.UserDao;
import com.myproject.beans.User;
import com.myproject.dao.DaoException;


public class AdminDaoImpl implements UserDao{
	
	private static final String GET_ALL_ADMIN = "SELECT * FROM admin";
	
	private static final String GET_BY_LOGIN_AND_PASSWORD = "SELECT id, login, password FROM admin"
			+ " WHERE  login = ? AND password = ?";
	
	private DataSource datasource;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public  List<User> getAll() throws DaoException {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<User>  list =template.query(GET_ALL_ADMIN, 
				new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

	@Override
	public User getByLoginAndPassword(String login, String password) throws DaoException {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<User> list = template.query(GET_BY_LOGIN_AND_PASSWORD, 
				new BeanPropertyRowMapper<User>(User.class), login, password);
		if(list.size() == 0){
			return null;
		}else{
			return list.get(0);
		}
		
	}
}
