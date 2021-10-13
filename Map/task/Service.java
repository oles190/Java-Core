package Map.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {

    Map<Person, List<Account>> map = new HashMap<>();

    public Map<Person, List<Account>> getMap() {
        return map;
    }

    public void setMap(Map<Person, List<Account>> map) {
        this.map = map;
    }


    public void addPerson(Person person){
        map.put(person, new ArrayList<>());

    }
    public void add(Person person, List<Account>accounts){
        map.put(person,accounts);
    }
}
