package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Service {

    Map<Person, List<Account>> map;

    public Map<Person, List<Account>> getMap() {
        return map;
    }

    public void setMap(Map<Person, List<Account>> map) {
        this.map = map;
    }

    public Service(Map<Person, List<Account>> map) {
       this.map = map;
    }


    @Override
    public String toString() {
        return "Service{" +
                "map=" + map +
                '}';
    }

    public void addPerson(Person person){
        map.put(person,new ArrayList<>());
    }

    public void addAccount(Person person,Account account) {
        List<Account> list = map.get(person);
        list.add(account);
        map.put(person, list);

    }

    public void removeByPersonAccount(Person person,Account account){
        List<Account> list =map.get(person);
        list.remove(account);
        map.put(person,list);

    }
    public void deletePerson(Person person){
        map.remove(person);
    }

    public void print(){
        for(Map.Entry<Person,List<Account>> entry: map.entrySet()){
            System.out.println(entry);
        }
    }
}


