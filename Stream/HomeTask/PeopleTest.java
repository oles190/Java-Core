package Stream.HomeTask;

import java.util.*;

public class PeopleTest {


    public static void main(String[] args) {

        People people1= new People("Anton",22,"man");
        People people5= new People("Anton",21,"man");
        People people2= new People("Tom",17,"man");
        People people3= new People("Ivanka",21,"woman");
        People people4= new People("Anna",15,"woman");

        List<People> list= new ArrayList<>(Arrays.asList(people1,people2,people3,people4));
        List<People> list1= new ArrayList<>(Arrays.asList(people1,people2,people3,people4,people5));


        System.out.println(" task 1");
        list.stream()
                .filter(person->person.getAge()>=18)
                .filter(s->s.getSex().equals("man"))
                .forEach(System.out::println);
        System.out.println("task 2");
double average = list.stream().filter(s->s.getSex().equals("man")).mapToInt(People::getAge).average().getAsDouble();
        System.out.println(average);
        System.out.println("task 3");

        list.stream().filter(s->s.getSex().equals("man"))
                .filter(s->s.getAge()>=18 && s.getAge()<60).forEach(System.out::println);
        list.stream().filter(s->s.getSex().equals("woman"))
                .filter(s->s.getAge()>=18 && s.getAge()<55).forEach(System.out::println);
        System.out.println("task 4");
PeopleComparator peopleComparator = new PeopleComparator();
        list.stream().sorted(peopleComparator).forEach(System.out::println);
        System.out.println("task 5");
        list1.stream().sorted().forEach(System.out::println);
        System.out.println("task 6");

        list.stream().mapToInt(People::getAge).max().stream().forEach(System.out::println);

        System.out.println("task 7");
        list.stream().mapToInt(People::getAge).min().stream().forEach(System.out::println);
        System.out.println("task 8");
      Long a=  list.stream().filter(s->s.getSex().equals("man")).count();
        System.out.println(a);
        System.out.println("task 9");
        System.out.println(list.stream().filter(s->s.getSex().equals("woman")).count());
        System.out.println("task 10");
        list.stream().filter(s->s.getSex().equals("woman"))
                .filter(s->s.getName().startsWith("A")).forEach(System.out::println);





    }
}
