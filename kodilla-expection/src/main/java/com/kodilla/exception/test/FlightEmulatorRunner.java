package com.kodilla.exception.test;

public class FlightEmulatorRunner {

    public static void main(String[] args) {
        Flight BerlinLondyn = new Flight("BERLIN", "LONDYN");
        Flight ParyżLondyn = new Flight("PARYŻ", "LONDYN");
        Flight RzymWarszawa = new Flight("RZYM", "WARSZAWA");

        FlightEmulator flightSearcher = new FlightEmulator();

        try {
            boolean existBerlinLondyn = flightSearcher.findFlight(BerlinLondyn);
            System.out.println("Flight Berlin - London: " + existBerlinLondyn);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existParyżLondyn = flightSearcher.findFlight(ParyżLondyn);
            System.out.println("Flight Rome - New York City: " + existParyżLondyn);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existRzymWarszaws = flightSearcher.findFlight(RzymWarszawa);
            System.out.println("Flight Paris - Warsaw: " + existRzymWarszaws);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

    }
}
