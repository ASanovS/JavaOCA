package lesson35;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Porshe GT 500", "Red", 6.0));

        for (Car ourCar : ourCars) {
            System.out.println(ourCar);
        }
        System.out.println();

        changeCar(ourCars.get(0), car -> {
            car.color = "Black";
            car.engine = 8.0;
            System.out.println("Update car: " + car);
        });

        for (Car ourCar : ourCars) {
            System.out.println(ourCar);
        }
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}
