package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(5, 5);
        double subResult = calculator.sub(5, 2.5);
        double mulResult = calculator.mul(8, 8);
        double divResult = calculator.div(21, 3);

        //Then
        Assert.assertEquals(10, addResult, 0.01);
        Assert.assertEquals(2.5, subResult, 0.01);
        Assert.assertEquals(64, mulResult, 0.01);
        Assert.assertEquals(7, divResult, 0.01);
    }
}
