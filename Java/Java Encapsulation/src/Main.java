public class Main {

    public static void main(String[] args) {

        //Encapsulation = attributes of a class will be hidden or private.
        //                Can be accessed only through methods (getters and setters)
        //                You should make attributes private if you don't have a reason to make them public

        Car car = new Car("Chevrolet", "Camaro", 2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setMake("Fiat");
        car.setModel("500");
        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }

}
