package lesson6;

public class App {
    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(sum(5));
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));
        System.out.println(sum(5, 5, 5, 5));
    }

    static String sum() {
        return "Входящие параметры отсутсвуют сумма = 0";
    }

    static int sum(int a) {
        return a + 0;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
