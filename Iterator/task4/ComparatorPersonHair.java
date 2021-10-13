package Iterator.task4;

import java.util.Comparator;

public class ComparatorPersonHair implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getHairColour().name().compareTo(o2.getHairColour().name());
    }
}
