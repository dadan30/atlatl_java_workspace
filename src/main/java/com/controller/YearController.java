package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Year;
import com.service.YearService;

@Controller
@RequestMapping("/year")
public class YearController {
	
	@Resource
    private YearService yearService;

	@RequestMapping("/getYearsInfo")
	@ResponseBody
	public List<String> getYearsInfo() {
		List<Year> yearsList = this.yearService.getYears();
		List<String> years = new ArrayList<String>();
		for (int i = 0; i < yearsList.size(); i++) {
			years.add(yearsList.get(i).getYear());
		}
        return years;
	}

}
