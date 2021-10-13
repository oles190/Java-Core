package Map;

import java.util.*;

public class Task2Start {

    public static void main(String[] args) {


        Service service = new Service(create());
        service.print();
        System.out.println("------");

        service.print();
        Person person = new Person("Oles", 32);

        Account account = new Account(2, "dqdq", "dasda");
        Account account1 = new Account(3, "dqdq", "dasda");

        service.addPerson(person);
        service.addAccount(person, account);
        service.print();
        System.out.println("------------");
        service.removeByPersonAccount(person, account);
        service.print();

        service.deletePerson(person);
        service.print();

    }
        public static Map<Person, List<Account>> create() {

            Map<Person, List<Account>> map = new HashMap<>();
            Person person1 = new Person("person1", 22);
            List<Account> accounts1 = new ArrayList<>(Arrays.asList(new Account(1, "ac1", "email1"),
                    new Account(2, "ac2", "email2")));
            Person person2 = new Person("person2", 23);
            List<Account> accounts2 = new ArrayList<>(Arrays.asList(new Account(3, "ac3", "email3"),
                    new Account(4, "ac4", "email4")));
            map.put(person1, accounts1);
            map.put(person2, accounts2);

            return map;


        }

}