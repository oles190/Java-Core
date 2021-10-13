package Iterator.HomeTask;

import java.util.*;

public class Service {

    private List<Commodity> list =new ArrayList<>();

    public List<Commodity> getList() {
        return list;
    }

    public Service(List<Commodity> list) {
        this.list = list;
    }

    public void setList(List<Commodity> list) {
        this.list = list;
    }

//
//    public Service(){
//        list= new ArrayList<>();
//    }

    public void addCommodity(Commodity commodity){
        list.add(commodity);
    }

   public void deleteCommodity(int index){
        list.remove(index);
}

public  void exchange(int index,Commodity commodity) {
    list.set(index, commodity);
}

public void sortByName(){
    Collections.sort(list);
}


public void sortByLength() {
        list.sort(commodityLengthComparator);

}

public void sortByWidth(){
list.sort(commodityWidthComparator);
    }

public void sortByWeight(){
list.sort(commodityWeightComparator);
    }
public void print(int index){
    System.out.println(list.get(index));
}



Comparator<Commodity>commodityLengthComparator = new Comparator<Commodity>() {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getLength()-o2.getLength();
    }
};


    Comparator<Commodity>commodityWeightComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWeight()-o2.getWeight();
        }
    };

    Comparator<Commodity> commodityWidthComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWidth() - o2.getWidth();
        }
    };


}

