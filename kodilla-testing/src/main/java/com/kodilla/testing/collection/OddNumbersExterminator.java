package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer>numbers){
        int temporaryValue = 0;
        for (int n=0; n <numbers.size(); n++){
            if (temporaryValue %2 ==0){
                System.out.println(temporaryValue);
            }
        }
    }


}
