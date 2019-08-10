package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightEmulator {
    private final Map<String, Boolean> airportMap;

    public FlightEmulator() {
        airportMap = airportDataBase();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        }else{
            throw new RouteNotFoundException("Airport don't exist!");
        }
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("BERLIN", true);
        airportDataBase.put("LONDYN", true);
        airportDataBase.put("PARYŻ", false);
        airportDataBase.put("RZYM", false);
        airportDataBase.put("WARSZAWA", true);

        return airportDataBase;
    }
}
