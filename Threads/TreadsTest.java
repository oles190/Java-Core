package Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreadsTest extends Thread{

    private  List<Integer> numbers;
    private int time;
    public TreadsTest(List<Integer>numbers,int time){
    this.numbers=numbers;
    this.time=time;

}

    @Override
    public void run() {

        for(Integer number:numbers){
            System.out.println(getName()+" "+ number);
            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
