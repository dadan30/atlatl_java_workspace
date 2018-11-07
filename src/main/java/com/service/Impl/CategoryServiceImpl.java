package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDao;
import com.model.Category;
import com.service.CategoryService;
 
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public int getCategoryInfoMaxLength() {
		return categoryDao.getCategoryInfoMaxLength();
	}
	
	@Override
	public List<Category> getCategoryInfo() {
		return categoryDao.getCategoryInfo();
	}
	
	@Override
	public String getCategoryValue(String market_data_industry_category_id) {
		return categoryDao.getCategoryValue(market_data_industry_category_id);
	}
}
