package Set.task1;

import java.util.Comparator;

public class ComparatorByCount implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o2.getCount()- o1.getCount();

    }
}
