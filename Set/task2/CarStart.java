package Set.task2;

import java.util.*;

public class CarStart {

    public static void main(String[] args) {


        Car car1  = new Car("BMV",2025);
        Car car2  = new Car("MERSS",2021);
        Car car3  = new Car("AUDI",2022);

        Set<Car> set = new LinkedHashSet<>(Arrays.asList(car1,car2,car3));
        System.out.println(set);
        System.out.println(new TreeSet<>(set));
        System.out.println(new HashSet<>(set));




    }
}
