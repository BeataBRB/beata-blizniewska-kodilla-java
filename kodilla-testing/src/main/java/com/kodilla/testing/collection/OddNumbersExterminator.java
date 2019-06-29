package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Random;


public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddNumberList = new ArrayList<>();



        for (int number:numbers) {
            if (number % 2 == 0){
                oddNumberList.add(number);
            }
        }
        return oddNumberList;

   }



}
