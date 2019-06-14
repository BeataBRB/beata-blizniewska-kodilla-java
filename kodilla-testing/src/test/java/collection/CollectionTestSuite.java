package collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;


public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator testerOne = new OddNumbersExterminator();
        testerOne.exterminate();
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int n=0; n < 200; n++){
            list.add(random.nextInt(100));
        };
        OddNumbersExterminator tester = new OddNumbersExterminator();
        tester.exterminate(list);
    }
}
