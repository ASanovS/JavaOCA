package lesson17.hw;

/*
 * Создайте класс в котором будет метод ravenstvo.
 * Инпут параметрами будут 2 объекта класса StringBuilder.
 * Метод должен иметь boolean return type, возвращать true
 * если значения совпадают, false если не совпадают.
 */

public class App {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = sb3;

        System.out.println(ravenstvo(sb1, sb2));
        System.out.println(ravenstvo(sb2, sb3));
        System.out.println(ravenstvo(sb4, sb3));
        System.out.println(ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(ravenstvo(new StringBuilder(), new StringBuilder()));
    }

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {

        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
