package com.myproject.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.beans.Admin;
import com.myproject.dao.DaoException;
import com.myproject.dao.DaoFactory;

@Controller
public class CommonController {

	@RequestMapping("/Index.spr")
	public ModelAndView goHomepage() {
		return new ModelAndView("home");
	}

	@RequestMapping("/Authenticate.spr")
	public ModelAndView authenticate(@RequestParam("login") String login, 
			@RequestParam("password") String password, HttpSession session) throws DaoException {
		Admin admin = DaoFactory.getAdminDao().getByLoginAndPassword(login, password);
		ModelMap model = new ModelMap();
		if(admin != null){
			session.setAttribute("user", admin);
			model.addAttribute("session",session);
			model.addAttribute("succes","Authenticate successful");
			return new ModelAndView("home", model );
		}else{
			return new ModelAndView("home","message","Wrong password");
		}
	}
	
	@RequestMapping("/Logout.spr")
	public ModelAndView logout(@RequestParam("login") String login, 
			@RequestParam("password") String password, HttpSession session) throws DaoException{
	if(session != null){
		session.invalidate();
	}
		
		return new ModelAndView("home","out","you lefted account");
	}
	
	@RequestMapping("List.spr")
	public ModelAndView getAllAdmins() throws DaoException{
		List<Admin> admin = DaoFactory.getAdminDao().getAll();
		return new ModelAndView("listCustomers","listOfAdmins",admin);
	}

}
