package com.twu.refactoring;

public class Rental {

    private Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double amountForRental() {
        return movie.amount(daysRented);
    }

    public int frequentRentalPoints() {
        return movie.frequentPoints(daysRented);
    }

}