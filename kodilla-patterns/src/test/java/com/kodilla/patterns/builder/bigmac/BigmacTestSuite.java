package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacOrder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(RollType.STANDARD)
                .burgers(1)
                .sauce(SouceType.BBQ)
                .ingredients(IngredientsType.CHEESE)
                .ingredients(IngredientsType.CHILI_PEPPERS)
                .ingredients(IngredientsType.BACON)
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(1, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
    }
}
