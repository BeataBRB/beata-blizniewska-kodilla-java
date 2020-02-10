package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent();
        Continent asia = new Continent();
        Continent australia = new Continent();

        Country poland = new Country("38000000");
        Country kosovo = new Country("1831000");
        Country japan = new Country("126800000");
        Country vietnam = new Country("95540000");
        Country sudan = new Country("40530000");
        Country angola = new Country("29780000");
        Country russia = new Country("144500000");

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
        BigDecimal totalPeopleExpected = new BigDecimal("476981000");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}