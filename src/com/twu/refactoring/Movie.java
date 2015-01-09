package com.twu.refactoring;

public class Movie {

	private String title;
	private PriceCode priceCode;

	public Movie(String title, PriceCode priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public void setPriceCode(PriceCode arg) {
    	priceCode = arg;
	}

	public String getTitle () {
		return title;
	}

	public double amount(int daysRented) {
        return priceCode.amount(daysRented);
    }

	public int frequentPoints(int daysRented) {
		return priceCode.frequentPointers(daysRented);
    }
}

