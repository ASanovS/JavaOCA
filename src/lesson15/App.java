package lesson15;

public class App {
    public static void main(String[] args) {

        int a = 5;
        do {
            //int a = 5; =======> cannot be resolved a variable
            System.out.println(a++ + " ");
        } while (a <= 15); 

    }
}
