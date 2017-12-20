package com.faberi.example.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.faberi.example.dao.IUserDao;
import com.faberi.example.entity.User;
import com.faberi.example.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
