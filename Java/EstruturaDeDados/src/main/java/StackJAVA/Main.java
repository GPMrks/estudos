package StackJAVA;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Car> stackCars = new Stack<>();

        stackCars.push(new Car("Ford"));
        stackCars.push(new Car("Chevrolet"));
        stackCars.push(new Car("Fiat"));

        System.out.println(stackCars);

        stackCars.pop();

        System.out.println(stackCars);

        stackCars.push(new Car("Porsche"));

        System.out.println(stackCars);

        System.out.println(stackCars.peek());

        System.out.println(stackCars);

        System.out.println(stackCars.empty());


    }
}
