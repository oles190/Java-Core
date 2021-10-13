package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        String data = "";

//Зчитуємо з файла!!!
        try (InputStream inputStream = new FileInputStream
                ("/Users/olesdoskuc/Desktop/ValenTest/src/IO/input.txt")) {
            while (inputStream.available() > 0) {
                data += (char) inputStream.read();

            }
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Person> people = new ArrayList<>();

        for (String line : data.split("\n")) {
            String[] elements = line.split(",");
            Person person = new Person(elements[0].trim(), Integer.parseInt(elements[1].trim()));
            people.add(person);



        }
        System.out.println(people);

        //Записуємо в файл!!!

        File file=new File("/Users/olesdoskuc/Desktop/ValenTest/src/IO/output.txt");

        try{
            file.createNewFile();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try(OutputStream outputStream = new FileOutputStream(file)){
            outputStream.write(people.toString().getBytes());
        }catch (IOException e){
            e.getMessage();
        }



    }

}

