package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.model.Market;

@Mapper
public interface MarketDao {
	public List<Market> getMarketByBrand(
			@Param(value = "market_data_country") String market_data_country,
			@Param(value = "market_data_industry_category_id") String market_data_industry_category_id,
			@Param(value = "market_data_indicator") String market_data_indicator);
	
	public List<Market> getMarketByCategory(
			@Param(value = "market_data_country") String market_data_country,
			@Param(value = "market_data_industry_category_id") String market_data_industry_category_id,
			@Param(value = "market_data_indicator") String market_data_indicator);
	
	public List<Market> getMarketByChannel(
			@Param(value = "market_data_country") String market_data_country,
			@Param(value = "market_data_industry_category_id") String market_data_industry_category_id,
			@Param(value = "market_data_indicator") String market_data_indicator);
	
	public List<Market> getMarketByCompany(
			@Param(value = "market_data_country") String market_data_country,
			@Param(value = "market_data_industry_category_id") String market_data_industry_category_id,
			@Param(value = "market_data_indicator") String market_data_indicator);
}