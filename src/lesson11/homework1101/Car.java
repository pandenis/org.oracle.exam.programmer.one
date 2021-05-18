package lesson11.homework1101;

public class Car {
    String color;
    String engine;
    int numberOfDoors;

    public Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

}

class CarTest{
    public static void numberOfDoorsChanger(int newNumber, Car c) {
        c.numberOfDoors = newNumber;
    }

    public static void colorChanger(Car c1, Car c2) {
        String temp = c1.color;
        c1.color = c2.color;
        c2.color = temp;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Red", "V6", 4);
        Car car2 = new Car("Black", "V8", 4);

        System.out.println(car1.numberOfDoors);
        numberOfDoorsChanger(2, car1);
        System.out.println(car1.numberOfDoors);

        System.out.println("car1.color: " + car1.color);
        System.out.println("car2.color: " + car2.color);
        System.out.println("------------------------");
        colorChanger(car1, car2);
        System.out.println("car1.color: " + car1.color);
        System.out.println("car2.color: " + car2.color);
    }
}
