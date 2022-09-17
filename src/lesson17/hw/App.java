package lesson17.hw;

/*
 * Создайте класс в котором будет метод ravenstvo.
 * Инпут параметрами будут 2 объекта класса StringBuilder.
 * Метод должен иметь boolean return type, возвращать true
 * если значения совпадают, false если не совпадают.
 */

public class App {
    public static void main(String[] args) {
        
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb3 = sb2;
        
        System.out.println(ravenstvo(sb1, sb2));
        System.out.println(ravenstvo(sb2, sb3));
    }

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        return sb1 == sb2;
    }
}
