package Map.task;

public class Account {

    private String name;
    private int time;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Account(String name, int time) {
        this.name = name;
        this.time = time;
    }
}
