package EqualsAndHashCodeJAVA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford"));
        cars.add(new Car("Chevrolet"));
        cars.add(new Car("Volkswagen"));

        System.out.println(cars.contains(new Car("Ford")));
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Ford1").hashCode());

        Car car1 = new Car("Ford");
        Car car2 = new Car("Chevrolet");

        System.out.println(car1.equals(car2));

    }
}
