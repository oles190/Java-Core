package Map.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Service service = new Service();
        Person person = new Person("Oles",22);
        Account account1 = new Account("accoun1",2);
        Account account2 = new Account("accouun2",1);

        List<Account> accountList = new ArrayList<>(Arrays.asList(account1,account2));

        service.add(person,accountList);
        System.out.println(service.getMap());

    }
}
