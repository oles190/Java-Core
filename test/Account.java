package test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Service {
    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;


}
