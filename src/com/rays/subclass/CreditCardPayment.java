package com.rays.subclass;

public class CreditCardPayment extends Payment{

	private String ccType;

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	
}
