package com.hwua.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hwua.Service.UserService;
import com.hwua.entity.User;

public class test {
	@Autowired
	private UserService userService;
	
	@Test
	public void testSelectAllUsers() {
		List<User> selectAllUsers = userService.selectAllUsers();
		System.out.println(selectAllUsers);
	}

}
