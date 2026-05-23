package com.movie.review;

import java.util.ArrayList;
import java.util.List;

public class ReviewService {

    private List<Movie> movies = new ArrayList<>();

    public void addReview(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getAllReviews() {
        return movies;
    }
}
