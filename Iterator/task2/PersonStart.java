package Iterator.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonStart {

    public static void main(String[] args) {



        Person person1= new Person("Oles",22);
        Person person2= new Person("Oleg",12);
        Person person3= new Person("Anton",25);
        List<Person> list = new ArrayList<>();
        list= Arrays.asList(person1,person2,person3);


        Collections.sort(list);
        System.out.println(list);


    }
}
