package com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
 
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
 
	@Override
	public User getNameById(int id) {
		return userDao.getNameById(id);
	}
}
