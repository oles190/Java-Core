package Collections.HomeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();


        while (!list.contains("break")) {
            list.add(scanner.nextLine());
        }

        System.out.println("All words");
        for(String one:list){
            System.out.println(one);
        }

        System.out.println("All words start with S");
        for(String one:list){
            if(one.toLowerCase().startsWith("s")){
                System.out.println(one);
            }
        }

        System.out.println("All words who have size more than 5 ");
        for(String one:list){
            if(one.length()>5){
                System.out.println(one);
            }
        }

    }

}
