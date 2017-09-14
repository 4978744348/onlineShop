package com.myproject.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.myproject.beans.ResultBean;
import com.myproject.beans.User;
import com.myproject.dao.DaoException;
import com.myproject.dao.DaoFactory;

@Controller
@RequestMapping("/json")
public class CommonControllerJSON {

	@RequestMapping("/Authenticate.spr")
	@ResponseBody
	public String authenticate(@RequestParam("json") String json, HttpSession session) throws DaoException {
		User bean = new Gson().fromJson(json, User.class);
		User user = DaoFactory.getUserDao().getByLoginAndPassword(bean.getLogin(), bean.getPassword());
		if (user != null) {
			session.setAttribute("user", user);
			return new ResultBean(1, "authenticate.success").toString();
		} else {
			return new ResultBean(1, "authenticate.fail").toString();
		}

	}

}
