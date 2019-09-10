package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User millennials = new Millennials("Beata");
        User yGeneration = new YGeneration("Blanka");
        User zGeneration = new ZGeneration("Paweł");

        //When
        String snapchat = millennials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millennials = new Millennials("Beata");
        millennials.setSocialPublisher(new FacebookPublisher());

        //When
        String facebook = millennials.sharePost();

        //Then
        Assert.assertEquals("Facebook", facebook);
    }
}
