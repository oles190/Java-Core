package String;
//    Ввести n слів з консолі. Знайти найдовше і найкоротше слово та вказати яким воно було введено(порядковий номер).
//    Ввести n слів з консолі. Вивести на екран слова які починаються на ‘a’ і мають парну кількість символів.

import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        Map<Integer,Integer> map= new HashMap<>();
Set<Integer>list = new TreeSet<>();
        list.add(2);
        list.add(1);
        list.add(14);





        map.put(1,3);
        map.put(1,4);
        map.put(2,3);

        System.out.println(map);



        String[] words = enterWords();
        theShortestWord(words);
        theLongestWord(words);
        startsWithLetter_A(words);
    }


    public static String[] enterWords() {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[10];
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }
        return words;
    }

    public static void theShortestWord(String[] list) {
        int index = 0;
        String word = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].length() <= word.length()) {
                index = i;
                word = list[i];
            }
        }
        System.out.println("The shortest word is: " + word + "; index - " + (index + 1));
    }


    public static void theLongestWord(String[] list) {
        int index = 0;
        String word = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].length() >= word.length()) {
                index = i;
                word = list[i];
            }
        }
        System.out.println("The longest word is: " + word + "; index - " + (index));
        System.out.println(list[index]);
    }

    public static void startsWithLetter_A(String[] list) {
        char delim = '"';
        System.out.println("All words, which starts with letter " + delim + "A" + delim +
                "\nand have an even number of characters:");
        for (int i = 0; i < list.length; i++) {
            if (list[i].toLowerCase().startsWith("a") && list[i].length() % 2 == 0) {
                System.out.println(list[i]);
            }
        }
    }

}