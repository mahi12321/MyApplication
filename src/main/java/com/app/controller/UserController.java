package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.User;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;

	@RequestMapping("/reg")
	public String regPage(Model map) {
		map.addAttribute("user", new User());
		return "UserReg";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String userSave(@ModelAttribute User user, Model map) {
		Integer id = service.saveUser(user);
		map.addAttribute("message", "User saved with '" + id + "' successfully");
		map.addAttribute("user", new User());
		return "UserReg";
	}

	@RequestMapping("/login")
	public String loginPage(Model map) {
		map.addAttribute("user", new User());
		return "UserLogin";
	}
	@RequestMapping(value ="/doLogin", method = RequestMethod.POST)
	public String getUserData(@RequestParam("userName") String username, @RequestParam("userPwd") String password,
			Model map, HttpServletRequest req) {
		String page = null;
		User user = service.findByUserNameAndUserPwd(username, password);
		if (user == null) {
			page = "UserLogin";
			map.addAttribute("user", new User());
			map.addAttribute("message", "Username/Password is invalid !!");
		} else {
			HttpSession ses = req.getSession();
			ses.setAttribute("name", user.getUserName());
			page = "UserHome";
		}
		return page;
	}
	@RequestMapping("/doLogout")
	public String logoutPage(HttpServletRequest req, Model map) {
		HttpSession ses = req.getSession(false);
		map.addAttribute("user", new User());
		ses.setAttribute("name", null);
		ses.invalidate();
		map.addAttribute("message", "User logout Successfully !!");
		return "UserLogin";

	}
}
