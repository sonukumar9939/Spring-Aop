package com.example.demo;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OptionHeader {

	private Date tradeDate = null;

	private String derivativeType = null;

	private String instrumentName = null;

	private String priceSource = null;

	private String deliveryPeriod = null;

	private BigDecimal strikePrice = null;

	private String priceType = null;

	private BigDecimal premium = null;

	private String priceUnit = null;

	private BigDecimal delta = null;

	private BigDecimal gamma = null;

	private BigDecimal theta = null;

	private BigDecimal vega = null;

	private List<Stocks> stocks = null;

}
