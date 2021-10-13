package Iterator.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonStart {


    public static void main(String[] args) {


        Person person1 = new Person("Oles",HairColour.WHILE);
        Person person2 = new Person("Oles",HairColour.AED);
        Person person3 = new Person("Oles",HairColour.BLACK);

        ComparatorPersonHair comparatorPersonHair = new ComparatorPersonHair();


        List<Person> list = new ArrayList<>();

        list = Arrays.asList(person1,person2,person3);
        Collections.sort(list,comparatorPersonHair);


        for(Person one:list){
            System.out.println(one);
        }



    }
}
