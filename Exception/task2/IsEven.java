package Exception.task2;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) throws  IncorrectNumberEntryException {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number;
        try {
            number = Integer.parseInt(line);
        }catch (Exception e){
            throw new IncorrectNumberEntryException("number is not Integer");
        }


         check(number);
    }

    public static void check(int a){

        if(isEven(a)){
            System.out.println("number is even");
        }else{
            System.out.println("number is not even");
        }
    }



    public static boolean isEven(int a){
        return a%2==0;

    }
}
