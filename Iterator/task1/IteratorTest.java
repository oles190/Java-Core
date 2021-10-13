package Iterator.task1;

import java.util.*;

public class IteratorTest {



    public static void main(String[] args) {




        List<Integer> list= new ArrayList<>();
        list= Arrays.asList(1,3,5,72,2,4);

        ListIterator<Integer> listIterator = list.listIterator();
        Iterator<Integer> iterator = list.iterator();


        int z;
        while (listIterator.hasNext()){
            list.set(listIterator.nextIndex(), listIterator.next()*5);

        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Previous");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
