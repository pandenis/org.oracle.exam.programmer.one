package lesson5;

public class Car {
/*    Car(String c, String e){
        color = c;
        engine = e;
        System.out.println("Object is created!");
    }*/

    Car(String c, String e) {
        color = c;
        engine = e;
        System.out.println("Color is: " + color + " Engine is: " + engine);
    }
    String color;
    String engine;
}

class CarTes {
    public static void main(String[] args) {

        Car car = new Car("red", "V3");

        System.out.println("Color: " + car.color);
        System.out.println("Engine: " + car.engine);
    }
}
