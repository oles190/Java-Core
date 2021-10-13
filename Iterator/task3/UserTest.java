package Iterator.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserTest {


    public static void main(String[] args) {

        User user1 = new User("Oles",22,"doskuch@com");

        User user2 = new User("Oles",19,"bos@com");

        User user3 = new User("Oles",17,"abs@comjjascascas");


        List<User> list = new ArrayList<>();
        list= Arrays.asList(user1,user2,user3);


        UserComparator userComparator = new UserComparator();
        Collections.sort(list,userComparator);

        //Collections.sort(list);


      //  Collections.sort(list);
        System.out.println(list);

    }

}
