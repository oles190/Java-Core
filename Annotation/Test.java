package Annotation;

public class Test {

    @MyAnnotation(name="Anton")
    private String name;

    @MyAnnotation(name="Anton")
    public String getName() {
        return name;
    }


    @MyAnnotation(name="Anton")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation(name="Anton")
    private int age;

    @MyAnnotation(name="Anton")
    public void print(){
        System.out.println(age+" "+name);
    }
}
