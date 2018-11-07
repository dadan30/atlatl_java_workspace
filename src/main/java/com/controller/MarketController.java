package com.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.model.Market;
import com.service.CategoryService;
import com.service.MarketService;

@RestController
@RequestMapping("/market")
public class MarketController {

	@Resource
	private CategoryService categoryService;
	
	@Resource
	private MarketService marketService;

	@RequestMapping(value = "/getMarketDataByBrand", method = RequestMethod.POST)
	public JSONArray getMarketDataByBrand(@RequestBody Map<String,String[]> map) {
		String country = "'" + map.get("country")[0] + "'";
		String[] categoryIds = map.get("categoryId");
		String categoryIdForSearch = "";
		for (int i = 0; i < categoryIds.length; i++) {
			String categoryId = categoryIds[i];
			if (i == categoryIds.length - 1) {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'";
			} else {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'" + ",";
			}
		}
		String indicator = "'" + map.get("indicator")[0].toLowerCase() + "'";
		List<Market> marketList = 
				this.marketService.getMarketByBrand(country, categoryIdForSearch, indicator);

		JSONArray jArray = new JSONArray();
		for (int i = 0; i < marketList.size(); i++) {
			JSONObject jObject = new JSONObject();
			String[] years = map.get("year");
			for (int j = 0; j < years.length; j++) {
				String category = this.categoryService.getCategoryValue(marketList.get(i).getCategoryId());
				jObject.put("category", category);
				jObject.put("brand", marketList.get(i).getMarketBrand());
				jObject.put("company", marketList.get(i).getMarketCompany());
				if (years[j].equals(marketList.get(i).getMarket_data_year())) {
					jObject.put("year" + years[j], "〇");
				} else {
					jObject.put("year" + years[j], "✖");
				}
			}
			jArray.add(jObject);
			
		}
		return jArray;
	}
	
	@RequestMapping(value = "/getMarketDataByCategory", method = RequestMethod.POST)
	public JSONArray getMarketDataByCategory(@RequestBody Map<String,String[]> map) {
		String country = "'" + map.get("country")[0] + "'";
		String[] categoryIds = map.get("categoryId");
		String categoryIdForSearch = "";
		for (int i = 0; i < categoryIds.length; i++) {
			String categoryId = categoryIds[i];
			if (i == categoryIds.length - 1) {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'";
			} else {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'" + ",";
			}
		}
		String indicator = "'" + map.get("indicator")[0].toLowerCase() + "'";
		List<Market> marketList = 
				this.marketService.getMarketByCategory(country, categoryIdForSearch, indicator);

		JSONArray jArray = new JSONArray();
		for (int i = 0; i < marketList.size(); i++) {
			JSONObject jObject = new JSONObject();
			String[] years = map.get("year");
			for (int j = 0; j < years.length; j++) {
				String category = this.categoryService.getCategoryValue(marketList.get(i).getCategoryId());
				jObject.put("category", category);
				if (years[j].equals(marketList.get(i).getMarket_data_year())) {
					jObject.put("year" + years[j], "〇");
				} else {
					jObject.put("year" + years[j], "✖");
				}
			}
			jArray.add(jObject);
		}
		return jArray;
	}
	
	@RequestMapping(value = "/getMarketDataByChannel", method = RequestMethod.POST)
	public JSONArray getMarketDataByChannel(@RequestBody Map<String,String[]> map) {
		String country = "'" + map.get("country")[0] + "'";
		String[] categoryIds = map.get("categoryId");
		String categoryIdForSearch = "";
		for (int i = 0; i < categoryIds.length; i++) {
			String categoryId = categoryIds[i];
			if (i == categoryIds.length - 1) {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'";
			} else {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'" + ",";
			}
		}
		String indicator = "'" + map.get("indicator")[0].toLowerCase() + "'";
		List<Market> marketList = 
				this.marketService.getMarketByChannel(country, categoryIdForSearch, indicator);

		JSONArray jArray = new JSONArray();
		for (int i = 0; i < marketList.size(); i++) {
			JSONObject jObject = new JSONObject();
			String[] years = map.get("year");
			for (int j = 0; j < years.length; j++) {
				String category = this.categoryService.getCategoryValue(marketList.get(i).getCategoryId());
				jObject.put("category", category);
				jObject.put("channel", marketList.get(i).getMarketChannel());
				if (years[j].equals(marketList.get(i).getMarket_data_year())) {
					jObject.put("year" + years[j], "〇");
				} else {
					jObject.put("year" + years[j], "✖");
				}
			}
			jArray.add(jObject);
		}
		return jArray;
	}

	@RequestMapping(value = "/getMarketDataByCompany", method = RequestMethod.POST)
	public JSONArray getMarketDataByCompany(@RequestBody Map<String,String[]> map) {
		String country = "'" + map.get("country")[0] + "'";
		String[] categoryIds = map.get("categoryId");
		String categoryIdForSearch = "";
		for (int i = 0; i < categoryIds.length; i++) {
			String categoryId = categoryIds[i];
			if (i == categoryIds.length - 1) {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'";
			} else {
				categoryIdForSearch = categoryIdForSearch + "'" + categoryId + "'" + ",";
			}
		}
		String indicator = "'" + map.get("indicator")[0].toLowerCase() + "'";
		List<Market> marketList = 
				this.marketService.getMarketByCompany(country, categoryIdForSearch, indicator);

		JSONArray jArray = new JSONArray();
		for (int i = 0; i < marketList.size(); i++) {
			JSONObject jObject = new JSONObject();
			String[] years = map.get("year");
			for (int j = 0; j < years.length; j++) {
				String category = this.categoryService.getCategoryValue(marketList.get(i).getCategoryId());
				jObject.put("category", category);
				jObject.put("company", marketList.get(i).getMarketCompany());
				if (years[j].equals(marketList.get(i).getMarket_data_year())) {
					jObject.put("year" + years[j], "〇");
				} else {
					jObject.put("year" + years[j], "✖");
				}
			}
			jArray.add(jObject);
		}
		return jArray;
	}
}
