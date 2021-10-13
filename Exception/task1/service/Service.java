package Exception.task1.service;

import Exception.task1.exception.IncorrectEmailException;
import Exception.task1.exception.UnderAgeException;
import Exception.task1.model.Person;

public class Service {

    public  void check(Person person) throws UnderAgeException,IncorrectEmailException{


        if(!person.isAdult()){
            throw new UnderAgeException("Not adult");
        }else{
            System.out.println("good age");
        }
        if(!person.isCorrectEmail()){
            throw new IncorrectEmailException("incorrect email");
        }else{
            System.out.println("good email");

        }

    }
}
