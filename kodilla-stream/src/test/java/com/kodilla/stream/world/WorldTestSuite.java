package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Africa");

        Country poland = new Country("Poland");
        Country kosovo = new Country("Kosovo");
        Country japan = new Country("Japan");
        Country vietnam = new Country("Vietnam");
        Country sudan = new Country("Sudan");
        Country angola = new Country("Angola");
        Country russia = new Country("Russia");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(australia);

        europa.addCountry(poland);
        europa.addCountry(kosovo);
        europa.addCountry(russia);

        asia.addCountry(japan);
        asia.addCountry(vietnam);
        asia.addCountry(russia);

        australia.addCountry(sudan);
        australia.addCountry(angola);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("7000007");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}