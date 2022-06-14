package lesson10;

import lesson9.*;

import static lesson9.Car.*;

public class Application {
    public static void main(String[] args) {
        lesson9.Car c1 = new lesson9.Car("v6", "black");
        Car c2 = new Car("v8", "red");

        System.out.println("Engine c1 = " + c1.engine);

        System.out.println("Color c2 " + c2.color);

        System.out.println("Import static variable = " + kind);

        // end-of-line комментарий действителен до конца строки

        /*
         * multiline комментарий действителен
         * на нескольких строках
         */

        /**
         * Javadoc комментарий помогает описывать класс
         * для составления документации
         * формат документа будет html
         */
    }
}
