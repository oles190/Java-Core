package Iterator.HomeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestCommodity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Commodity commodity1 = new Commodity("Cola",22,13,33);
        Commodity commodity2 = new Commodity("Milk",21,3,8);
        boolean b =true;
        List<Commodity> list = new ArrayList<>(Arrays.asList(commodity1, commodity2));
        Service service = new Service(list);






        while(b){

            System.out.println("\nselect next action:\n" +
                    "1 - add commodity;\n" +
                    "2 - remove commodity;\n" +
                    "3 - replace commodity;\n" +
                    "4 - sort by name;\n" +
                    "5 - sort by length;\n" +
                    "6 - sort by weight;\n" +
                    "7 - sort by width;\n" +
                    "8 - print one commodity from your storage;\n" +
                    "9 - print all commodities from your storage;\n" +
                    "0 - exit;\n");


        int a= scanner.nextInt();
        switch (a) {


            case 1: {
                service.addCommodity(createCommodity());
                System.out.println("Success");
                break;
            }

            case 2: {
                try {
                    service.deleteCommodity(scanner.nextInt());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("You don't have any commodity");
                }
                System.out.println("Success");

                break;
            }

            case 3: {
                System.out.println("Enter index ");
                int index = scanner.nextInt();
                service.exchange(index, createCommodity());
                break;
            }

            case 4: {
                service.sortByName();
                System.out.println("Success");
                break;
            }

            case 5: {
                service.sortByLength();
                System.out.println("Success");
                break;
            }

            case 6: {
                service.sortByWeight();
                System.out.println("Success");
                break;

            }
            case 7: {
                service.sortByWidth();
                System.out.println("Success");
                break;

            }
            case 8: {
                System.out.println("Enter index ");

                service.print(scanner.nextInt());
                break;
            }
            case 9: {
                for (Commodity one : service.getList()) {
                    System.out.println(one);

                }
                break;
            }

            case 0: {
                System.out.println("BYE");
                b = false;
            }
        }



        }

    }
    public static Commodity createCommodity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the commodity name:");
        String name = scanner.next();
        System.out.println("Enter the commodity length:");
        int length=scanner.nextInt();
        System.out.println("Enter the commodity weight:");
        int weight = scanner.nextInt();
        System.out.println("Enter the commodity width:");
        int width = scanner.nextInt();
        return  new Commodity(name,length,weight,width);




    }


}
