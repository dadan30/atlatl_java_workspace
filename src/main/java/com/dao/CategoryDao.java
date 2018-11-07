package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.model.Category;

@Mapper
public interface CategoryDao {

	public int getCategoryInfoMaxLength();
	
	public List<Category> getCategoryInfo();
	
	public String getCategoryValue(@Param(value = "market_data_industry_category_id") String market_data_industry_category_id);

}
