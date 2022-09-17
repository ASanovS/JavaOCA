package lesson17;

//Lesson 17 learning StringBuilder

public class App {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder(); // capacity by defaul 16
        System.out.println(sb1.capacity());
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50); // вместимость 50 символов (capacity)
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb1.length()); // Возвращает длинну массива чаров.
        System.out.println(sb2.length());

        System.out.println(sb2.charAt(3)); // Возвращает символ по индексу

        // в СтрингБилдер в индексОф используется только стринг
        System.out.println(sb2.indexOf("d")); // возвращает индекс нужной части строки
        System.out.println(sb2.indexOf("d", 4)); // Возвращает индекс d начиная поис с 4 индекса

        String s = sb2.substring(5); // Возвращает новый Стринг начиная указанного индекса
        System.out.println(s);
        String s1 = sb2.substring(3, 6); // Возвращает новый Стринг в диапазоне указанных индексов
        System.out.println(s1);
        System.out.println(sb2.subSequence(3, 6)); // Возвращает новый CharSequence в диапазоне индексов

        sb2.append(" Hello!"); // метод append изменяет сам стринг билдер
        System.out.println(sb2); // можно добавлять как примитивные методы так и объекты типа Строка
        sb2.append(sb2);
        System.out.println(sb2);

        StringBuilder sb5 = new StringBuilder("Hello Builder!");
        System.out.println(sb5.insert(5, " String")); // Вставляет на указанную позицию любой тип данных

        sb5.delete(6, 13); // Удаляет часть элементов СтрингБилдера в указанном диапазоне индексов
        System.out.println(sb5);

        sb5.deleteCharAt(6);
        System.out.println(sb5); // Удаляет один чар по указанному символу

        sb5.reverse(); // переворачивает СтринБилдер в обратную сторону
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("Vsem Privet");
        sb6.replace(0, 5, "Joe"); // Заменяет символы в указаном диапазоне на указанную строку
        System.out.println(sb6);
        System.out.println(sb6.capacity()); // возвращает capacity

        System.out.println();
        StringBuilder sb7 = new StringBuilder("123"); // Создается новый объект
        StringBuilder sb8 = sb7.append("45"); // sb8 ссылается на объект sb7 и добавляет в него новые символы
        sb8 = sb8.append("6").append("7");
        System.out.println("sb7 " + sb7);
        System.out.println("sb8 " + sb8);
        System.out.println(sb7 == sb8); // получаем тру т.к. сб7 и сб8 ссылаются на один и тот же объект
        System.out.println(sb7.equals(sb8)); // получаем тру т.к. содержимое двух ссылок одно и тоже(один и тот же
                                             // объект). Нужно помнить что метод иквесл в классе СтринБилдер не
                                             // перезаписан и работак как ==

    }
}
