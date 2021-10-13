package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws ClassNotFoundException {



        List<String> list= new ArrayList<>(Arrays.asList("One","Two","Three","Four","Five","One"));

        System.out.println(list.stream().filter(s->s.equals("One")).count()); //1
        System.out.println("-----");
        System.out.println(list.stream().findFirst().orElse("0"));
        System.out.println("-----");
        System.out.println(list.stream().skip(list.size()-1).findFirst().orElse("Empty"));
        System.out.println("-----");
        System.out.println(list.stream().filter(e->e.equals("Three")).findAny().orElseThrow(ClassNotFoundException::new));
        System.out.println("-----");
        System.out.println( list.get(2));
        list.stream().skip(2).findFirst().ifPresent(System.out::println);
        System.out.println("-----");
        list.stream().skip(1).limit(2).forEach(System.out::println);
        System.out.println("-----");
        list.stream().filter(s->s.length()>3).forEach(System.out::println);
        System.out.println("-----");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("-----");
     list.stream().filter(s->s.equals("One")).findAny().ifPresent(System.out::println);
        System.out.println("-----");
        System.out.println(list.stream().allMatch(s->s.contains("o")));
        System.out.println("-----");
        list.stream().map(s->s+"1").forEach(System.out::println);
        System.out.println("-----");
        list.stream().distinct().sorted().forEach(System.out::println);



    }
}
