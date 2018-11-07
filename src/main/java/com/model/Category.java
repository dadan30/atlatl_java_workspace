package com.model;

public class Category {

	private String market_data_industry_category_id;
	
	private String market_data_industry_category_name;

	public String getCategoryId() {
		return market_data_industry_category_id;
	}

	public void setCategoryId(String category_id) {
		this.market_data_industry_category_id = category_id;
	}
	
	public String getCategoryName() {
		return market_data_industry_category_name;
	}

	public void setCategoryName(String category_name) {
		this.market_data_industry_category_name = category_name;
	}
}
