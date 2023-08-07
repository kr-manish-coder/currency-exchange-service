package com.manish.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.microservices.currencyexchangeservice.dtos.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer>{
	
	CurrencyExchange findByFromAndTo(String from, String to);

}
