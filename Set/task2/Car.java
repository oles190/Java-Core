package Set.task2;

public class Car implements Comparable<Car>{

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
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

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Car o) {
        if(this.age-o.getAge()!=0){
            return this.age-o.getAge();
        }else{
            return this.name.compareTo(o.getName());
        }
    }
}
