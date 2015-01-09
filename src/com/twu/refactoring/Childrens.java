package com.twu.refactoring;

/**
 * Created by khusbooj on 09/01/15.
 */
public class Childrens extends PriceCode {
    @Override
    public double amount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;

    }
    @Override
    public int frequentPointers(int daysRented) {
        int frequentRenterPoints = 0;
        // add frequent renter points
        frequentRenterPoints++;

        return frequentRenterPoints;
    }
}
