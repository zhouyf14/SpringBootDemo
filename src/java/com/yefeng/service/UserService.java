package com.yefeng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yefeng.dao.UserDao;
import com.yefeng.pojo.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 查询用户
	 * @param id
	 * @return
	 */
	public User findById(Integer id) {
		return userDao.findById(id).get();
	}

}
