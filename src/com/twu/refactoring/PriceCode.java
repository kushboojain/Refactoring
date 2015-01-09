package com.twu.refactoring;

/**
 * Created by khusbooj on 09/01/15.
 */
public abstract class PriceCode {
    public abstract double amount(int daysRented);
    public abstract int frequentPointers(int daysRented);
}
