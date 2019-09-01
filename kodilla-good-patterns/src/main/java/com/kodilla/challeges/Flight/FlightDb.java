package com.kodilla.challeges.Flight;

import java.util.Set;

public class FlightDb {
    private Set<Flight> availableFlights;

    public FlightDb(Set<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public FlightDb() {
    }

    public Set<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
