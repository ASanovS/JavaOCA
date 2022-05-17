package lesson8;

public class App {
    public static void main(String[] args) {
        System.out.println(Task1.umnozhenije(2, 3, 4));
        Task1.delenie(9, 2);
        System.out.println(Task1.umnozhenije(2.5, 3.5, 4.5));
        Task1.delenie(15, 4);

        Task2 task2 = new Task2();

        System.out.println("Ploshad kruga" + task2.ploshadKruga(5));
        System.out.println("Dlina kruga" + Task2.dlinaKruga(5));
        task2.printInfo(5);
    }
}