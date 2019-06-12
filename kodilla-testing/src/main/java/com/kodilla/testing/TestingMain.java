package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator simpleCalculator = new Calculator();
        Calculator calculator = new Calculator();
        int resultOne = simpleCalculator.addAToB(5, 5);
        int resultTwo = simpleCalculator.subtractAFromB(5,7);

        System.out.println(resultOne);
        System.out.println(resultTwo);
    }
}
