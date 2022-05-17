package lesson8;

public class Task2 {
    
    public static final double PI = 3.14;

    public double ploshadKruga(int radius) {
        double ploshad = PI * radius * radius;
        return ploshad;
    }

    public static double dlinaKruga(int radius) {
        double dlina = 2 * PI * radius;
        return dlina;
    }

    public void printInfo(int radius) {
        System.out.println("Radius kruga = " + radius);
        System.out.println("Ploshad kruga = " + ploshadKruga(radius));
        System.out.println("Dlina kruga = " + dlinaKruga(radius));
    }
}
