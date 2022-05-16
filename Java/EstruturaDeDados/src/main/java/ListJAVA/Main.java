package ListJAVA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Ford"));
        carList.add(new Car("Chevrolet"));
        carList.add(new Car("Fiat"));
        carList.add(new Car("Peugeot"));

        System.out.println(carList.contains(new Car("Ford")));

        System.out.println(carList.get(2));

        System.out.println(carList.indexOf(new Car("Fiat")));

        System.out.println(carList.remove(2));

        System.out.println(carList);


    }
}
