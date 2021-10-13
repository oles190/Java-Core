package Reflection;

import Exception.task3.Methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CarReflection {


    public static void main(String[] args) throws Exception {


        Car car = new Car("BMW",2020,300);
        Class<Car> carClass =Car.class;

        // отримати поля класу (private в тому числі);
        Field[] declaredFields=carClass.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field);
        }
        System.out.println("\nBefore changes: " + car);
        //змінюємо одне з полів
        Field carAge =carClass.getDeclaredField("age");
        carAge.setAccessible(true);
        carAge.set(car,23);
        System.out.println("After changes: " + car + "\n");

        // отримати всі методи (private в тому числі);
        Method[] declaredMethods =carClass.getDeclaredMethods();
        for(Method method:declaredMethods){
            System.out.println(method);
        }

        //викликаємо метод з параметром
        Method method=carClass.getDeclaredMethod("sportSpeed",int.class);
        method.setAccessible(true);
        method.invoke(car,24);


        //викликаємо метод без параметрів
        Method method1=carClass.getDeclaredMethod("printInformation");
        method1.setAccessible(true);
        method1.invoke(car);

        //отримати всі конструктори;
        Constructor[]constructors=carClass.getConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);

        }

        //створити екземпляр класу;

        Class[] param = {String.class, int.class, int.class};
        Car car2 = (Car) carClass.getConstructor(param).newInstance("Audi", 2022, 220);
        System.out.println(car2);


    }
}
