package com.twu.refactoring;

/**
 * Created by khusbooj on 09/01/15.
 */
public class Regular extends PriceCode {

    @Override
    public double amount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;

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
