package lesson12;

public class Application {
    
    public static void main(String[] args) {

        int a = 10;

        //Если в условном операторе отсутствуют кавычки
        //Будет выполняться только первая строка которая
        //идет после условия нужно помнить эти тонкости
        //но всегда использовать фигурные скобки
        
        if (a > 20) 
            System.out.println("A > 20");
        else
            System.out.println("A < 20");

        System.out.println("String");

        if (a < 20) {
            System.out.println("A < 10");
            System.out.println("Next string");
            System.out.println("Next next string");
        } else {
            System.out.println("A > 20");
            a++;
        }
    }
}
