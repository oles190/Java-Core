package Lambda.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonTest {


    public static void main(String[] args) {



        List<Person> allPeople = new ArrayList<>(Arrays.asList(
                new Person("Tom",17),
                new Person("Misha",22),
                new Person("Ilya",15),
                new Person("Ivan",18),
                new Person("Oles",23)));


        List<Person> peopleAdult = new ArrayList<>();
        List<Integer>lentPer = new ArrayList<>();


        allPeople.forEach(s->{
            if(s.getAge()>=18){
                peopleAdult.add(s);
                }
                }
                );


        allPeople.forEach(person->person.setTimestamp(LocalDate.now()));
        allPeople.forEach(p-> lentPer.add(p.getName().length())


    );


        System.out.println("All people "+allPeople);
        System.out.println("Adult people "+peopleAdult);
        System.out.println("Len people's name "+lentPer);





    }
}
