package Stream.HomeTask;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
