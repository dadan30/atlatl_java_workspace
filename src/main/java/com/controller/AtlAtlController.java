package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Category;
import com.model.User;
import com.service.CategoryService;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class AtlAtlController {
	
	@Resource
    private UserService userService;

	@Resource
    private CategoryService categoryService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
}
