package lesson14;

public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue;
            }

            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        time();
    }
    
    static void time() {
        for (int chas = 0; chas < 23; chas++) {
            for (int minut = 0; minut < 59; minut++) {
                System.out.println(chas + ":" + minut);
            }
        }
    }
}
