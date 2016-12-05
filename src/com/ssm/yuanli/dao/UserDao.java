package com.ssm.yuanli.dao;

import com.ssm.yuanli.entity.User;

public interface UserDao {
	
	/**
	 * 登录验证
	 * @param user
	 * @return
	 */
	public User login(User user);
}
