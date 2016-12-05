package com.ssm.yuanli.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ssm.yuanli.dao.UserDao;
import com.ssm.yuanli.entity.User;
import com.ssm.yuanli.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}
	
	
}
