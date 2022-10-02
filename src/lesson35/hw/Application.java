package lesson35.hw;

import lesson10.hw10.p1.A;

import java.awt.print.Printable;
import java.util.function.Predicate;

/*

 */
public class Application {

    public static void main(String[] args) {
        Application ap = new Application();

        //Создать лямбда выражение, которое возвращает значение true,
        // если строка не null, используя функциональный интерфейс Predicate.
        //Создать лямбда выражение, которое проверяет,
        // что строка не пуста, используя функциональный интерфейс Predicate.
        //Написать программу проверяющую, что строка не null и не пуста,
        // используя метод and() функционального интерфейса Predicate.
        Predicate<String> predicateCheckNull = s -> s != null;
        System.out.println(predicateCheckNull.test(" "));
        System.out.println(predicateCheckNull.test(null));
        System.out.println();

        Predicate<String> predicateCheckEmpty = s -> !s.isEmpty();
        System.out.println(predicateCheckEmpty.test(""));
        System.out.println(predicateCheckEmpty.test("empty"));
        System.out.println();

        Predicate<String> predicateAnd = predicateCheckNull.and(predicateCheckEmpty);
        System.out.println(predicateAnd.test("test"));
        System.out.println(predicateAnd.test(""));
        System.out.println(predicateAnd.test(null));

        //Написать программу, которая проверяет,
        // что строка начинается буквой “J”или “N” и заканчивается “A”.
        // Используем функциональный интерфейс Predicate.
        System.out.println("Check is String first and last words");
        System.out.println(checkStringFirstAndLastWords("NanA", s -> s.startsWith("N") && s.endsWith("A")));
        System.out.println(checkStringFirstAndLastWords("JanA", s -> s.startsWith("J") && s.endsWith("A")));
        System.out.println(checkStringFirstAndLastWords("Nana", s -> s.startsWith("N") && s.endsWith("A")));
        System.out.println(checkStringFirstAndLastWords("Jana", s -> s.startsWith("J") && s.endsWith("A")));
    }

    static boolean checkStringFirstAndLastWords(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }
}
