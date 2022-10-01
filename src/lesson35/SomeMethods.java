package lesson35;

import java.util.ArrayList;
import java.util.List;

public class SomeMethods {

    public static void main(String[] args) {
        List<String> list = List.of("Privet", "poka", "kak dela?", "vse normalno!");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);

        System.out.println();

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            integerArrayList.add(i);
        }

        System.out.println(integerArrayList);
        integerArrayList.removeIf(e -> e % 3 == 0);
        System.out.println(integerArrayList);

        System.out.println();
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        integerArrayList1.add(1);
        integerArrayList1.add(9);
        integerArrayList1.add(2);
        integerArrayList1.add(4);
        integerArrayList1.add(18);
        integerArrayList1.add(13);
        integerArrayList1.add(10);
        System.out.println(integerArrayList1);
//        integerArrayList1.sort((integer1, anotherInteger1) -> integer1.compareTo(anotherInteger1));
        integerArrayList1.sort(Integer::compareTo);
        System.out.println(integerArrayList1);
        integerArrayList1.sort((integer, anotherInteger) -> -integer.compareTo(anotherInteger));
        System.out.println(integerArrayList1);


    }
}
