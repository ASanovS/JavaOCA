package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        
        //Теоретическая часть
        /**
         * Арифметические операторы 
         * "+" - оператор сложения
         * "-" - оператор вычитания
         * "*" - оператор умножения
         * "/" - оператор деления
         * "%" - оператор остаток от деления
         * "++" - оператор инкримент
         * "--" - оператор дикримент
         */

        int a = 25;
        int b = 70;

        int plus = a + b;
        System.out.println(plus);

        int minus = b - a;
        System.out.println(minus);

        int multiplication = a * b;
        System.out.println(multiplication);

        int division = b / a;
        System.out.println(division);

        int remainderOfTheDivision = b % a;
        System.out.println(remainderOfTheDivision);

        int increment = a++;
        System.out.println(increment);

        int decrement = b--;
        System.out.println(decrement);
        

    }
    
}
