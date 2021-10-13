package Iterator.task3;

public class User implements  Comparable<User> {

    private String name;
    private int age;
    private String Email;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        Email = email;
    }

    @Override
    public int compareTo(User user) {

        if(this.name.compareTo(user.getName())!=0){
            return this.name.compareTo(user.getName());
        }else if(this.age!=user.getAge()){
            return  this.age-user.getAge();
        }else{
            return  this.Email.compareTo(user.getEmail());
        }

    }
}
