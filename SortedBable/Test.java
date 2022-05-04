package SortedBable;


import java.util.*;

public class Test {

    public static void main(String[] args) {

        Core core = new Core(12);
        System.out.println(core);


        String m = "Ooles";
        String b = "Alin";
        System.out.println(m.compareTo(b));
        String s = "Вероніка:Яхта;Тарас:Бабій;Андрій:Антонко;Олесь:Доскуч;Марк:Гнто";

        System.out.println(met(s));


        System.out.println(met("Gari:Doter;Andriy:Belech;Bob:Clik;Dima:Ailo"));
    }


    static String met(String input) {

        String[] friends = input.split(";");
        List<String> list = Arrays.asList(friends);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] firstName = o1.split(":");
                String[] secondName = o2.split(":");
                int compareLastName = firstName[1].trim().compareToIgnoreCase(secondName[1].trim());
                if (compareLastName == 0) {
                    return firstName[0].compareToIgnoreCase(secondName[0]);

                }
                return compareLastName;

            }
        });
//        list.sort((o1, o2) -> {
//
//            String[] firstName = o1.split(":");
//            String[] secondName = o2.split(":");
//            int compareLastName = firstName[1].trim().compareToIgnoreCase(secondName[1].trim());
//            if (compareLastName == 0) {
//                return firstName[0].compareToIgnoreCase(secondName[0]);
//
//            }
//            return compareLastName;
//        });

        System.out.println("LIST" + list);
        return " ";

    }

}



