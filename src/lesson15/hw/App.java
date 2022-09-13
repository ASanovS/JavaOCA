package lesson15.hw;

/*
 * Переписасть домашнее задание из урока 14 так,
 * OUTER and INNER циклы представляли собой while loop,
 * MIDDLE цикл представлял собой do while loop.
 * 
 *  Создать класс
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

        int chas = 0;

        OUTER: 
        while (chas < 24) {

            int minut = 0;
            do {
                if (chas > 1 && minut % 10 == 0) {
                    break OUTER;
                }

                int second = 0;
                while (second < 60) {
                    if (second * chas > minut) {
                        break;
                    }
                    System.out.println(chas + ":" + minut + ":" + second);
                    second++;
                }

                minut++;
            } while (minut < 60);

            chas++;
        }
    }

}
