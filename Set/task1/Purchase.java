package Set.task1;

import java.util.Objects;

public class Purchase implements Comparable<Purchase> {

    private String name;
    private int count;

    public Purchase(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return count == purchase.count && Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.getName());
    }
}
