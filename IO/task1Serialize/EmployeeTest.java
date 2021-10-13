package IO.task1Serialize;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {


    public static void main(String[] args) {
        File file = new File("/Users/olesdoskuc/Desktop/ValenTest/src/IO/task1/Ser.txt");

        Employee employee1 = new Employee("Tom",23,5000);
        Employee employee2 = new Employee("Kol",43,4000);
        Employee employee3 = new Employee("Mel",13,1000);

        List<Employee> list  =new ArrayList<>(Arrays.asList(employee1,employee2,employee3));
        Methods.serialize(list,file);
        List<Employee> d = Methods.deserialize(file);
        System.out.println(d);

    }
}
