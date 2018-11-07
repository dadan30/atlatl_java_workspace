package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.model.Category;
import com.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Resource
	private CategoryService categoryService;

	@RequestMapping("/getCategoryInfo")
	@ResponseBody
	public JSONArray getCategoryInfo(HttpServletRequest request) {
		List<Category> categoryList = this.categoryService.getCategoryInfo();

		int categoryMaxLength = this.categoryService.getCategoryInfoMaxLength();
		// Test
		List<Category> testCategoryFirstLevelList = new ArrayList<>();
		List<Category> testCategorySecendLevelList = new ArrayList<>();
		List<Category> testCategoryThirdLevelList = new ArrayList<>();
		List<Category> testCategoryFoursLevelList = new ArrayList<>();
		List<Category> testCategoryFiveLevelList = new ArrayList<>();
		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).getCategoryId().length() == 2) {
				testCategoryFirstLevelList.add(categoryList.get(i));
			} else if (categoryList.get(i).getCategoryId().length() == 4) {
				testCategorySecendLevelList.add(categoryList.get(i));
			} else if (categoryList.get(i).getCategoryId().length() == 6) {
				testCategoryThirdLevelList.add(categoryList.get(i));
			} else if (categoryList.get(i).getCategoryId().length() == 8) {
				testCategoryFoursLevelList.add(categoryList.get(i));
			} else {
				testCategoryFiveLevelList.add(categoryList.get(i));
			}
		}
		JSONArray jArray = new JSONArray();
		for (int i = 0; i < testCategoryFirstLevelList.size(); i++) {
			JSONObject jObject = new JSONObject();
			jObject.put("id", testCategoryFirstLevelList.get(i).getCategoryId());
			jObject.put("label", testCategoryFirstLevelList.get(i).getCategoryName());
			JSONArray jArray1 = new JSONArray();
			for (int j = 0; j < testCategorySecendLevelList.size(); j++) {
				if (testCategorySecendLevelList.get(j).getCategoryId()
						.startsWith(testCategoryFirstLevelList.get(i).getCategoryId())) {
					JSONObject jObject1 = new JSONObject();
					jObject.put("id", testCategorySecendLevelList.get(j).getCategoryId());
					jObject1.put("label", testCategorySecendLevelList.get(j).getCategoryName());
					JSONArray jArray2 = new JSONArray();
					for (int m = 0; m < testCategoryThirdLevelList.size(); m++) {
						if (testCategoryThirdLevelList.get(m).getCategoryId()
								.startsWith(testCategorySecendLevelList.get(j).getCategoryId())) {
							JSONObject jObject2 = new JSONObject();
							jObject2.put("id", testCategoryThirdLevelList.get(m).getCategoryId());
							jObject2.put("label", testCategoryThirdLevelList.get(m).getCategoryName());
							JSONArray jArray3 = new JSONArray();
							for (int n = 0; n < testCategoryFoursLevelList.size(); n++) {
								if (testCategoryFoursLevelList.get(n).getCategoryId()
										.startsWith(testCategoryThirdLevelList.get(m).getCategoryId())) {
									JSONObject jObject3 = new JSONObject();
									jObject.put("id", testCategoryFoursLevelList.get(n).getCategoryId());
									jObject3.put("label", testCategoryFoursLevelList.get(n).getCategoryName());
									JSONArray jArray4 = new JSONArray();
									for (int k = 0; k < testCategoryFiveLevelList.size(); k++) {
										if (testCategoryFiveLevelList.get(k).getCategoryId()
												.startsWith(testCategoryFoursLevelList.get(n).getCategoryId())) {
											JSONObject jObject4 = new JSONObject();
											jObject.put("id", testCategoryFiveLevelList.get(k).getCategoryId());
											jObject4.put("label", testCategoryFiveLevelList.get(k).getCategoryName());
											jArray4.add(jObject4);
										}
									}
									jObject3.put("children", jArray4);
									jArray3.add(jObject3);
								}
							}
							jObject2.put("children", jArray3);
							jArray2.add(jObject2);
						}
					}
					jObject1.put("children", jArray2);
					jArray1.add(jObject1);
				}
			}
			jObject.put("children", jArray1);
			jArray.add(jObject);
		}
		return jArray;
	}

	/**
	 * 
	 * @return
	 */
	public JSONArray setCategoryJSONArray(int categoryMaxLength) {
		JSONArray jArray = new JSONArray();
		List<Category> categoryList = this.categoryService.getCategoryInfo();

		return jArray;
	}
}
