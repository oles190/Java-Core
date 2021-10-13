package Exception.task1;

import Exception.task1.exception.IncorrectEmailException;
import Exception.task1.exception.UnderAgeException;
import Exception.task1.model.Person;
import Exception.task1.service.Service;

public class Main {


    public static void main(String[] args) throws UnderAgeException,IncorrectEmailException {


        Person person1 = new Person("Oles","doskucho@gmail.com",22);
        Person person2= new Person("Andriy","andr@gmail.com",17);
        Person person3 = new Person("taras","tarasgmail.com",18);

      //  check(person1);


        Service service = new Service();
        service.check(person1);
    }
//    public static void check(Person person) throws UnderAgeException,IncorrectEmailException{
//        if(!person.isAdult()){
//            throw new UnderAgeException("Not adult");
//        }else{
//            System.out.println("good age");
//        }
//        if(!person.isCorrectEmail()){
//            throw new IncorrectEmailException("incorrect email");
//        }else{
//            System.out.println("good email");
//
//        }
//
//    }
}
