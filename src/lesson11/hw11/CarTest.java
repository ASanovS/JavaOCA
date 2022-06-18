package lesson11.hw11;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("Black", "V8", 4);
        Car car2 = new Car("Red", "V8", 2);

        System.out.println("Car 1 number of doors " + car1.doors);
        System.out.println("Car 2 number of doors " + car2.doors);

        newNumbersOfDoors(car1, 2);
        newNumbersOfDoors(car2, 4);

        System.out.println("Car 1 number of doors " + car1.doors);
        System.out.println("Car 2 number of doors " + car2.doors);

        System.out.println("Color Car 1 " + car1.color);
        System.out.println("Color Car 2 " + car2.color);
        
        swapColorInCars(car1, car2);
 
        System.out.println("Color Car 1 " + car1.color);
        System.out.println("Color Car 2 " + car2.color);
    }

    public static void newNumbersOfDoors(Car car, int doors) {
        car.doors = doors;
    }

    public static void swapColorInCars(Car car1, Car car2) {
        // Car car3 = new Car();
        // car3.color = car1.color;
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }
}
