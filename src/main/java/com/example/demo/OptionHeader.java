package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

	private BigDecimal vega =null ;
	
	private List<Stocks> stocks = null;

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getDerivativeType() {
		return derivativeType;
	}

	public void setDerivativeType(String derivativeType) {
		this.derivativeType = derivativeType;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getPriceSource() {
		return priceSource;
	}

	public void setPriceSource(String priceSource) {
		this.priceSource = priceSource;
	}

	public String getDeliveryPeriod() {
		return deliveryPeriod;
	}

	public void setDeliveryPeriod(String deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
	}

	public BigDecimal getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(BigDecimal strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public BigDecimal getPremium() {
		return premium;
	}

	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public BigDecimal getDelta() {
		return delta;
	}

	public void setDelta(BigDecimal delta) {
		this.delta = delta;
	}

	public BigDecimal getGamma() {
		return gamma;
	}

	public void setGamma(BigDecimal gamma) {
		this.gamma = gamma;
	}

	public BigDecimal getTheta() {
		return theta;
	}

	public void setTheta(BigDecimal theta) {
		this.theta = theta;
	}

	public List<Stocks> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stocks> stocks) {
		this.stocks = stocks;
	}

	public BigDecimal getVega() {
		return vega;
	}

	public void setVega(BigDecimal vega) {
		this.vega = vega;
	}

	@Override
	public String toString() {
		return "OptionHeader [tradeDate=" + tradeDate + ", derivativeType=" + derivativeType + ", instrumentName="
				+ instrumentName + ", priceSource=" + priceSource + ", deliveryPeriod=" + deliveryPeriod
				+ ", strikePrice=" + strikePrice + ", priceType=" + priceType + ", premium=" + premium + ", priceUnit="
				+ priceUnit + ", delta=" + delta + ", gamma=" + gamma + ", theta=" + theta + ", vega=" + vega
				+ ", stocks=" + stocks + "]";
	}

	


}
