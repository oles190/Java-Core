package Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {


    public static void main(String[] args) throws InterruptedException {

        TreadsTest treadsTest1 = new TreadsTest(Arrays.asList(1,2,5,5345,543,3,1500),1500);
        TreadsTest treadsTest2 = new TreadsTest(Arrays.asList(56,7,55,43,37,10,4),2200);


        List<String>list = new ArrayList<>(Arrays.asList("One","two","three","four"));
        list.forEach(e-> {

            e+=2;
            System.out.println(e);

        });





        System.out.println(list);




//
//        treadsTest1.start();
//        treadsTest1.join();
//
//        treadsTest2.start();



}
}
