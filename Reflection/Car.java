package Reflection;

public class Car {

    private String name;
    private int age;
    private int maxSpeed;


    public Car(String name, int age, int maxSpeed) {
        this.name = name;
        this.age = age;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    private void sportSpeed(int speed){
        System.out.println("go speed "+speed);
    }

    public void printInformation() {
        System.out.println(name + "/" + maxSpeed + "/"+ age );
    }

}

