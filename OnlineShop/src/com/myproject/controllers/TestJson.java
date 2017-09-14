package com.myproject.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.myproject.beans.User;
import com.myproject.dao.DaoException;
import com.myproject.dao.DaoFactory;

@Controller
public class TestJson {

	private Gson gson = new Gson();
	
	@RequestMapping("/getListJSON.spr")
	@ResponseBody
	public String getListuser() throws DaoException{
		List<User> list = DaoFactory.getUserDao().getAll();
		return gson.toJson(list);
		
	}
	

}
