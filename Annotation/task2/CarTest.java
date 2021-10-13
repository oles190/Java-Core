package Annotation.task2;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CarTest {


    public static void main(String[] args) {
        getFieldsWithAnnotation(Car.class);




    }
    public static <T> void getFieldsWithAnnotation(Class<T> tClass) {
        Field[] fields = tClass.getDeclaredFields();
        List<String> fieldList = new ArrayList<>();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(AuthorAnnotation.class);
            if (annotation != null) {
                fieldList.add("\n" + field.toString());
            }
        }
        writeFieldToFile(fieldList);
    }
    public static void writeFieldToFile(List<String> fields) {

        File file = new File("/Users/olesdoskuc/Desktop/ValenTest/src/Annotation/task2/Field_witch_Annotation.txt");

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(fields.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
