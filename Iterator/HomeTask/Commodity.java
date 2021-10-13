package Iterator.HomeTask;

import java.util.Objects;

public class Commodity  implements  Comparable<Commodity> {

    private String name;
    private int width;
    private int length;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Commodity(String name, int width, int length, int weight) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return width == commodity.width && length == commodity.length && weight == commodity.weight && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length, weight);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(Commodity o) {
        return this.name.compareTo(o.getName());
    }
}
