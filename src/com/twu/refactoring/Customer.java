package com.twu.refactoring;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Rental> rentalList = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentalList.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental : rentalList) {
            result += "\t" + rental.getMovie().getTitle() + "\t"
                    + String.valueOf(rental.amountForRental()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount()) + "\n";
        result += "You earned " + String.valueOf(frequentRentalPoints())
                + " frequent renter points";
        return result;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentalList) {
            // determine amounts for rental line
            totalAmount += rental.amountForRental();
        }
        return totalAmount;
    }

    private int frequentRentalPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentalList) {
            // determine amounts for rental line
            frequentRenterPoints += rental.frequentRentalPoints();
            // show figures for this rental
        }
        return frequentRenterPoints;
    }

    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>";
        for (Rental rental : rentalList) {
            result += rental.getMovie().getTitle() + ": "
                    + String.valueOf(rental.amountForRental()) + "<BR>";
        }
        // add footer lines
        result += "<P>You owe <EM>" + String.valueOf(totalAmount());
        result += "</EM><P>On this rental you earned <EM>" + String.valueOf(frequentRentalPoints())
                + "</EM> frequent renter points<P>";
        return result;


    }
}
