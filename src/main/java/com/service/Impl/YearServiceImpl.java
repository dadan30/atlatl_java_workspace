package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.YearDao;
import com.model.Year;
import com.service.YearService;
 
@Service
public class YearServiceImpl implements YearService{
	
	@Autowired
	private YearDao yearDao;
 
	@Override
	public List<Year> getYears() {
		return yearDao.getYears();
	}
	
}
