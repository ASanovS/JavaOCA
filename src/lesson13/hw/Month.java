package lesson13.hw;

public class Month {

    public void monthInfo(int input) {
        switch (input) {
            case 1:
                System.out.println("Кількість днів в січні 31");
                break;
            case 2:
                System.out.println("Кількість днів в лютому 28");
                break;
            case 3:
                System.out.println("Кількість днів в брезні 31");
                break;
            case 4:
                System.out.println("Кількість днів в квітні 30");
                break;
            case 5:
                System.out.println("Кількість днів в травні 31");
                break;
            case 6:
                System.out.println("Кількість днів в червні 30");
                break;
            case 7:
                System.out.println("Кількість днів в липні 31");
                break;
            case 8:
                System.out.println("Кількість днів в серпні 31");
                break;
            case 9:
                System.out.println("Кількість днів в вересні 30");
                break;
            case 10:
                System.out.println("Кількість днів в жовтні 31");
                break;
            case 11:
                System.out.println("Кількість днів в лисптопаді 30");
                break;
            case 12:
                System.out.println("Кількість днів в грудні 31");
                break;
            default:
                System.out.println("Not number this month");

        }
    }
}
