package Lambda.task2;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarTest {
    public static void main(String[] args) {

        Optional<Car> dreamCar=Optional.of(new Car("Audi",2020,460));
        Optional<Car> carForEveryDay = Optional.ofNullable(null);
        Optional<Car> myCar= Optional.empty();


        List<Optional<Car>> garage = new ArrayList<>(Arrays.asList(dreamCar,carForEveryDay,myCar));
        if(myCar.isPresent()){
            System.out.println(myCar.get());
        }

        garage.forEach(car ->car.ifPresent(System.out::println));
        Car car1 = new Car("Volkswagen Polo", 2017, 210);

        System.out.println(carForEveryDay.orElse(car1));
        System.out.println(myCar.orElse(car1));

        dreamCar.map(car->{
            car.setAge(2021);return car;
        });
        System.out.println(dreamCar);






    }
}
