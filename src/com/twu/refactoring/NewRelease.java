package com.twu.refactoring;

/**
 * Created by khusbooj on 09/01/15.
 */
public class NewRelease extends PriceCode {
    @Override
    public double amount(int daysRented) {
        return (daysRented * 3);

    }

    @Override
    public int frequentPointers(int daysRented) {
        int frequentRenterPoints = 0;
        // add frequent renter points
        frequentRenterPoints++;
        // add bonus for a two day new release rental

        if(daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
