package Exception.task2;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) throws  IncorrectNumberEntryException{
        Scanner scanner = new Scanner(System.in);



        sum(checkNumber(scanner.nextLine()),checkNumber(scanner.nextLine()));




    }
    public static void sum(int a,int b){
        System.out.println("Sum is " + (a+b));
    }

    public static int checkNumber(String line) throws IncorrectNumberEntryException {
        int number;
        try {
            number = Integer.parseInt(line);
        } catch (Exception e) {
            throw new IncorrectNumberEntryException("is not even ");
        }

        return  number;

    }
}
