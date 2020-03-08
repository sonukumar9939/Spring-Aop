package com.example.demo;

import java.math.BigDecimal;

public class Stocks {

	private String stockName = null;
	
	private BigDecimal qty = null;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

}
