package Set.task1;

import java.util.*;

public class Test {


    public static void main(String[] args) {

        Set<Purchase> list= createList();
        sortByName(list);
        System.out.println(list);
        sortByCount(list);
        hash(list);


    }


    public static Set<Purchase> createList(){

Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your list:");
        Set<Purchase> set = new LinkedHashSet<>();
        String name;
        int count;


        for(int i=0; i<3;i++){

             name = scanner.nextLine();
             count= Integer.parseInt(scanner.nextLine());
            set.add(new Purchase(name,count)); }
return set;
    }


    public static void sortByName(Set<Purchase>set){
        System.out.println(new TreeSet<>(set));

    }

    public static void sortByCount(Set<Purchase>set){
        ComparatorByCount comparatorByCount = new ComparatorByCount();
        Set<Purchase> purchaseSet = new TreeSet<>(comparatorByCount);
        purchaseSet.addAll(set);
        System.out.println(purchaseSet);

    }

    public static void hash(Set<Purchase> list){
        for(Purchase one:list){
            System.out.println("Hesh "+ one.hashCode());
        }
    }
        }
