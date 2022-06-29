package lesson13;

public class App {

    public static void main(String[] args) {

        Student st1 = new Student(5);

        // if (st1.grade == 2) {
        //     System.out.println("Stiden bad grade");
        // } else if (st1.grade == 3) {
        //     System.out.println("Student troeshnik");
        // } else if (st1.grade == 4) {
        //     System.out.println("Student horoshist");
        // } else if (st1.grade == 5) {
        //     System.out.println("Student otlichnik");
        // } else {
        //     System.out.println("Nevernaja ocenka");
        // }

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
