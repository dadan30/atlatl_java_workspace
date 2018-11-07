package com.model;

public class Market {

	private int record_id;
	
	private String market_data_year;
	
	private String market_data_country;

	private String market_data_industry_category_id;

	private String market_data_channel;
	
	private String market_data_brand;
	
	private String market_data_company;
	
	private String market_data_indicator;

	private String market_data_unit;
	
	private String market_data_value;

	private String market_data_source;
	
	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	
	public String getMarket_data_year() {
		return market_data_year;
	}

	public void setMarket_data_year(String market_data_year) {
		this.market_data_year = market_data_year;
	}
	
	public String getCountry() {
		return market_data_country;
	}

	public void setCountry(String market_data_country) {
		this.market_data_country = market_data_country;
	}
	
	
	public String getCategoryId() {
		return market_data_industry_category_id;
	}

	public void setCategoryId(String market_data_industry_category_id) {
		this.market_data_industry_category_id = market_data_industry_category_id;
	}
	
	public String getMarketChannel() {
		return market_data_channel;
	}

	public void setMarketChannel(String market_data_channel) {
		this.market_data_channel = market_data_channel;
	}
	
	public String getMarketBrand() {
		return market_data_brand;
	}

	public void setMarketBrand(String market_data_brand) {
		this.market_data_brand = market_data_brand;
	}	
	
	public String getMarketCompany() {
		return market_data_company;
	}

	public void setMarketCompany(String market_data_company) {
		this.market_data_company = market_data_company;
	}
	
	public String getIndicator() {
		return market_data_indicator;
	}

	public void setIndicator(String market_data_indicator) {
		this.market_data_indicator = market_data_indicator;
	}
	
	
	public String getUnit() {
		return market_data_unit;
	}

	public void setUnit(String market_data_unit) {
		this.market_data_unit = market_data_unit;
	}
	
	
	public String getValue() {
		return market_data_value;
	}

	public void setValue(String market_data_value) {
		this.market_data_value = market_data_value;
	}
	
	
	public String getDataSource() {
		return market_data_source;
	}

	public void setDataSource(String market_data_source) {
		this.market_data_source = market_data_source;
	}
}
