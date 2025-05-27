public class ClassObject {

    // Inner Car class
    static class Car {
        String make;
        String model;
        int year;

        void displayDetails() {
            System.out.println("Car Make : " + make);
            System.out.println("Car Model: " + model);
            System.out.println("Car Year : " + year);
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Tesla";
        car1.model = "Model S";
        car1.year = 2021;

        Car car2 = new Car();
        car2.make = "Ford";
        car2.model = "Mustang";
        car2.year = 2023;

        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
    }
}