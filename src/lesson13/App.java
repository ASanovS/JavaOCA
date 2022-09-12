package lesson13;

public class App {

    public static void main(String[] args) {

        Student st1 = new Student(5);

        switch (st1.grade) {
            case 2:
                System.out.println("Dvoeshnik");
                break;
            case 3:
                System.out.println("Troeshnik");
                break;
            case 4:
                System.out.println("Horoshist");
                break;
            case 5:
                System.out.println("Otlichnik");
                break;
            default:
                System.out.println("Nevernij result");
        }
    }
}
