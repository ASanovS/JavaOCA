package lesson16;

public class App {
    public static void main(String[] args) {

        String s1 = new String("Hello String"); //всегда создает новый объект
        
        String s2 = new String("Good by String");

        String s3 = new String("Good by String"); //новый объек хоть и значение такое же как и s2

        String s4 = "Hello"; // создаеться объект в стринг пул

        String s5 = "Hello"; // S5 ссылается на тот же объект что и S4 в стринг пуле


    }
}
