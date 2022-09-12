package lesson13.hw;

public class MA {
    public static void main(String[] args) {
        System.out.println(getDrinksWithStep(5, 3));
    }

    public static int getDrinksWithStep(int guestNumber, int step) {
        int sum = 0;
        for (int i = 1; i <= guestNumber; i += step) {
            sum += i;
        }
        return sum;
    }
}
