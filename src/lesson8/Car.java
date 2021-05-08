package lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human {
    String name = "Jhon";
    final Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        human.car.engine = "V5";
    }
}
