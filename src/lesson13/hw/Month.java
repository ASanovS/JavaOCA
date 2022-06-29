package lesson13.hw;

public class Month {

    public void monthInfo(int input) {
        switch (input) {
            case 2:
                System.out.println("Кількість днів в місяці 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Кількість днів в місяці 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Кількість днів в місяці 31");
                break;
            default:
                System.out.println("Not number this month");
        }
    }
}
