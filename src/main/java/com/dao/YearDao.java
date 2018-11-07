package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.model.Year;

@Mapper
public interface YearDao {
	public List<Year> getYears();
}
