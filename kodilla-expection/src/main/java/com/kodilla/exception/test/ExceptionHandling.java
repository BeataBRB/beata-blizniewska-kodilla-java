package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "No result!";
        double x = 3.0;
        double y = 3.0;

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));

        } catch (Exception e) {

            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println(result);
        }

    }
}
