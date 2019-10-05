package com.yefeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yefeng.pojo.User;
import com.yefeng.service.UserService;

/**
 * 控制器
 * @author Johnny.Chen
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Integer id) {
		return userService.findById(id);
	}

}
