public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("BMW", 2020);
        Car car2 = new Car("Tesla", 2021);
        Car fiat = new Car("Uno");

        garage.park(car1);
        garage.park(car2);
        garage.park(fiat);

    }
}
