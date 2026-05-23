package com.movie.review;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    static List<String> reviews = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Movie Review System =====");

        System.out.println("Enter Movie Name:");
        String movieName = scanner.nextLine();

        System.out.println("Enter Reviewer Name:");
        String reviewer = scanner.nextLine();

        System.out.println("Enter Your Review:");
        String review = scanner.nextLine();

        if (!movieName.isEmpty()
                && !reviewer.isEmpty()
                && !review.isEmpty()) {

            String reviewData =
                    addReview(movieName, reviewer, review);

            reviews.add(reviewData);

            logger.info(reviewData);

            System.out.println("\n===== Review Added Successfully =====");

            showReviews();

        } else {

            logger.error("Input fields cannot be empty!");

            System.out.println("Invalid Input!");
        }

        scanner.close();
    }

    public static String addReview(String movie,
                                   String reviewer,
                                   String review) {

        return "Movie: " + movie
                + "\nReviewer: " + reviewer
                + "\nReview: " + review;
    }

    public static void showReviews() {

        System.out.println("\n===== User Reviews =====");

        for (String r : reviews) {

            System.out.println("---------------------");
            System.out.println(r);
        }
    }
}
