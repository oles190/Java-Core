package Map.task1ZooClub;

import java.util.Objects;

public class Animal {


    private String name;
    private Type type;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Animal(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public static  Animal createAnimal() {
        Type type = null;

        System.out.println("Let's add an animal\nChose type of animal:\n1 - Dog;\n2 - Cat;");
        String num = ZooClubTest.scanner.nextLine();

        switch(num) {

            case ("1"): {
                type = Type.DOG;
                break;
            }
            case ("2"): {
                type = Type.CAT;
                break;
            }

        }
        System.out.println("Enter name:");
        String name = ZooClubTest.scanner.nextLine();

        Animal animal = new Animal(name, type);
        return animal;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && type == animal.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
