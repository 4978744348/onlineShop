package com.myproject.dao.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.myproject.beans.Admin;
import com.myproject.dao.AdminDao;
import com.myproject.dao.DaoException;

public class AdminDaoImpl implements AdminDao{
	
	private static final String GET_ALL_ADMIN = "SELECT * FROM admin";
	
	private static final String GET_BY_LOGIN_AND_PASSWORD = "SELECT id, login, password FROM admin"
			+ " WHERE  login = ? AND password = ?";
	
	private DataSource datasource;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public  List<Admin> getAll() throws DaoException {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<Admin>  list =template.query(GET_ALL_ADMIN, 
				new BeanPropertyRowMapper<Admin>(Admin.class));
		return list;
	}

	@Override
	public Admin getByLoginAndPassword(String login, String password) throws DaoException {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<Admin> list = template.query(GET_BY_LOGIN_AND_PASSWORD, 
				new BeanPropertyRowMapper<Admin>(Admin.class), login, password);
		if(list.size() == 0){
			return null;
		}else{
			return list.get(0);
		}
		
	}
}
