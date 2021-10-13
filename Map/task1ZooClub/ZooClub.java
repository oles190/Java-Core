package Map.task1ZooClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {

    private Map<Person, List<Animal>> zooClubList;

    public ZooClub(){
        zooClubList=new HashMap<>();
    }



    public Map<Person, List<Animal>> getZooClubList() {
        return zooClubList;
    }

    public void setZooClubList(Map<Person, List<Animal>> zooClubList) {
        this.zooClubList = zooClubList;
    }


    public   void addPerson(){
        System.out.println("Enter name");
        String name =ZooClubTest.scanner.nextLine();
        System.out.println("Enter age");
        int age =Integer.parseInt(ZooClubTest.scanner.nextLine());
        Person person = new Person(name,age);
        zooClubList.put(person,new ArrayList<>());
        System.out.println("You added "+person);

    }

    public void addAnimal(){
        System.out.println("Enter person name");
        String name =ZooClubTest.scanner.nextLine();
        System.out.println("Enter person age");
        int age=Integer.parseInt(ZooClubTest.scanner.nextLine());
        Person person = new Person(name,age);
        Animal animal =Animal.createAnimal();
        if(isFree(animal)){
            zooClubList.get(person).add(animal);
            System.out.println("You added "+animal);
        }else{
            System.out.println("Sorry this animal not free");
        }


    }





    public void removeAnimal(){
        System.out.println("Enter person's name:");
        String name =ZooClubTest.scanner.nextLine();
        System.out.println("Enter person' age");
        int age =Integer.parseInt(ZooClubTest.scanner.nextLine());
        System.out.println("Enter animal");
        Person person = new Person(name,age);
        System.out.println("Enet animal name");
        String nameAnimal=ZooClubTest.scanner.nextLine();
        System.out.println("Enter animal type");
        Type typeAnimal=Type.valueOf(ZooClubTest.scanner.next().toUpperCase());
        Animal animal = new Animal(nameAnimal,typeAnimal);
        zooClubList.get(person).remove(animal);
        System.out.println("You deleted "+ animal);

    }




    public void removePerson(){
        System.out.println("Enet person's name:");
        String name= ZooClubTest.scanner.nextLine();
        System.out.println("Enet person's age:");
        int age = Integer.parseInt(ZooClubTest.scanner.nextLine());
        Person person = new Person(name,age);
        zooClubList.remove(person);
        System.out.println("You deleted person "+person);


    }




    public boolean isFree(Animal animal) {
        for (Map.Entry<Person, List<Animal>> entry : zooClubList.entrySet()) {

            if (entry.getValue().contains(animal)) {
                return false;

            }

        }
        return true;
    }


public void print (){
        for(Map.Entry<Person,List<Animal>>entry:zooClubList.entrySet()){
            System.out.println(entry);
        }
}

}

