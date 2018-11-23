package com.hwua.controller;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hwua.Service.UserService;
import com.hwua.entity.User;

@Controller
public class Control {
	@Autowired
	private UserService userService;
	
	@RequestMapping(name="ss.action")
	public  ModelAndView select() {
		ModelAndView mv= new ModelAndView("select");
		List<User> selectAllUsers = userService.selectAllUsers();
		mv.addObject("selectAllUsers",selectAllUsers);
		return mv;		
	}
}
