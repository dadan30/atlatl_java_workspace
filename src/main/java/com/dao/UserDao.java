package com.dao;

import org.apache.ibatis.annotations.Mapper;

import com.model.User;

@Mapper
public interface UserDao {
	public User getNameById(int id);
}
