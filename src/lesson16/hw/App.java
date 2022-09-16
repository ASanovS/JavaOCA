package lesson16.hw;

/*
 * Создайте класс, в котором создайте метод email.
 * Данный метод принимает в метод 1 String параметр.
 * Данный параметр должен содержать в себе email в 
 * следющем виде: ya@yahoo.com; gog@gmail.com; ua@ukr.net;
 * т.е. после каждого email должен стоять знак препинания ";".
 * Ваш метод должен выводить информацию о том, какой почтой
 * пользуются, исходя из параметра.
 * Оутпут должен быть следующего вида:
 * 
 *  yahoo
 *  gmail
 *  ukr
 */

public class App {
    public static void main(String[] args) {

        String string = "ya@yahoo.com; gog@gmail.com; ua@ukr.net;";

        email(string);
        
        System.out.println("Exemple lesson 16");
        emailExampleSolution(string);
    }

    static void email(String str) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);

            if (c1 == '@') {
                start = i;
            }
            if (c1 == '.') {
                end = i;
                System.out.println(str.substring(start + 1, end));
            }
        }
    }

    static void emailExampleSolution(String str) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < str.length() - 1) {
            a = str.indexOf('@', c);
            b = str.indexOf('.', c);
            c = str.indexOf(';', c + 1);
            System.out.println(str.substring(a + 1, b));
        }
    }
}
