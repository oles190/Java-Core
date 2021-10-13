package Iterator.task4;

public class Person {


private String name;
private HairColour hairColour;

    public Person(String name, HairColour hairColour) {
        this.name = name;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HairColour getHairColour() {
        return hairColour;
    }

    public void setHairColour(HairColour hairColour) {
        this.hairColour = hairColour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hairColour=" + hairColour +
                '}';
    }
}

