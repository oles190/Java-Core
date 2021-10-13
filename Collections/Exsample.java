package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exsample {



    public static void main(String[] args) {

        List<Integer> list  = new ArrayList<>();
        List<Integer> list2  = new ArrayList<>();


        int [] mas = {2,1,6,5,8};
Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
int [] mas1 =Arrays.copyOf(mas,mas.length);
        System.out.println(Arrays.toString(mas1));

        System.out.println(list);



    }
}
