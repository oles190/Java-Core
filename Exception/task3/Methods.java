package Exception.task3;

import java.util.Scanner;

public class Methods {


    public static void main(String[] args) throws  Exception {


        Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();

try{
if(check(a,b)) {
    System.out.println(add(a, b));
    System.out.println(min(a, b));
    System.out.println(mul(a, b));
    System.out.println(del(a, b));
}



}catch (Exception e){
    System.out.println(e.toString());
}

    }

    public static boolean check(int a,int b) throws  Exception{

        if(a<0 && b<0){
            throw  new IllegalAccessException();
        }
        else if(a==0 && b!=0 || a!=0 && b==0){
            throw new  ArithmeticException();
        }
        else if(a==0 && b==0){
            throw  new IllegalAccessException();
        }
        else if(a>0 && b>0){
            throw  new MyException("my exception");
        }
        return true;
    }








    public static int add(int a ,int b){
        return a+b;

    }
    public static int min(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }

    public static int del(int a,int b){
        return a/b;
    }


}
