package lesson14.hw;

/*
 * Создать класс
 * В классе создать статический метод, который
 * будет выводить на экран время в формате "час:минута:секунда"
 * в интервале от 0 до 6 часов.
 * Если час больше 1 и минута кратна 10-ти, то метод нужно закончить.
 * Если же (секунда умноженая на час) больше минуты, 
 * то пора переходить на другую минуту.
 * 
 */

public class App {
    public static void main(String[] args) {

        time();
    }
    
    
    static void time() {

        OUTER:
        for (int chas = 0; chas < 24; chas++) {
            for (int minut = 0; minut < 59; minut++) {
                for (int second = 0; second < 59; second++) {
                    if (second * chas >= minut) {
                        continue;
                    }

                    if(chas > 1 && minut % 10 == 0) {
                        break OUTER;
                    }
                    System.out.println(chas + ":" + minut + ":" + second);
                }
            }
        }
    }
}
