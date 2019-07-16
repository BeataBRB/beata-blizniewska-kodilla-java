package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {2,6,5,9,7,6,4,8,9,4};
        double averageExpected = 6.0;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageExpected, average, 0.0001);
    }

}
