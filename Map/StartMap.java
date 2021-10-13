package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class StartMap {

    public static void main(String[] args) {
        Person person1= new Person("Oleg",22);
        Person person2  = new Person("Tom",21);
        Account account1= new Account(23,"Bob","bob@gmail");
        Account account2= new Account(14,"Riki","riki@gmail");
        Account account3= new Account(24,"PiLko","pilkoi@gmail");



        Map<Person,Account> map= new LinkedHashMap<Person, Account>();
        map.put(person1,account1);
        map.put(person2,account2);
       // System.out.println(map);


        map.put(person1,new Account(33,"Sold","Piter"));
        System.out.println("1 "+map);
        System.out.println(map.get(person1));


        map.put(person2,null);
        System.out.println("2 " +map);


        map.remove(person1);
        System.out.println("3 "+map);



}
}
