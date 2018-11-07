package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MarketDao;
import com.model.Market;
import com.service.MarketService;

@Service
public class MarketByBrandServiceImpl implements MarketService {

	@Autowired
	private MarketDao marketDao;

	@Override
	public List<Market> getMarketByBrand(String country, String categoryId, String indicator) {
		return marketDao.getMarketByBrand(country, categoryId, indicator);
	}

	@Override
	public List<Market> getMarketByCategory(String country, String categoryId, String indicator) {
		return marketDao.getMarketByCategory(country, categoryId, indicator);
	}

	@Override
	public List<Market> getMarketByChannel(String country, String categoryId, String indicator) {
		return marketDao.getMarketByChannel(country, categoryId, indicator);
	}

	@Override
	public List<Market> getMarketByCompany(String country, String categoryId, String indicator) {
		return marketDao.getMarketByCompany(country, categoryId, indicator);
	}
}
