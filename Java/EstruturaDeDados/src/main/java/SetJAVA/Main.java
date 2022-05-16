package SetJAVA;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Car> carSet = new HashSet<>();

        carSet.add(new Car("Ford"));
        carSet.add(new Car("Chevrolet"));
        carSet.add(new Car("Fiat"));
        carSet.add(new Car("Peugeot"));

        System.out.println(carSet);

        Set<Car> carTreeSet = new TreeSet<>();

        carTreeSet.add(new Car("Ford"));
        carTreeSet.add(new Car("Chevrolet"));
        carTreeSet.add(new Car("Fiat"));
        carTreeSet.add(new Car("Peugeot"));

        System.out.println(carTreeSet);
    }
}
