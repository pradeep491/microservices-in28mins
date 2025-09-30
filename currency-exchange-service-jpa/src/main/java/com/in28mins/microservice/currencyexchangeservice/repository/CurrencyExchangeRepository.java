package com.in28mins.microservice.currencyexchangeservice.repository;

import com.in28mins.microservice.currencyexchangeservice.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
