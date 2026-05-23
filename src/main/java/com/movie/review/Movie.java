package com.movie.review;

public class Movie {

    private String movieName;
    private String review;
    private int rating;

    public Movie(String movieName, String review, int rating) {
        this.movieName = movieName;
        this.review = review;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getReview() {
        return review;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName +
                "\nReview: " + review +
                "\nRating: " + rating + "/5";
    }
}
