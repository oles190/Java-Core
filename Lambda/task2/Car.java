package Lambda.task2;

public class Car {

    private String model;
    private int age;
    private int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public Car(String model, int age, int maxSpeed) {
        this.model = model;
        this.age = age;
        this.maxSpeed = maxSpeed;
    }
}
