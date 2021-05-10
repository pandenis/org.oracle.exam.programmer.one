package lesson09;

public class Car {
    private String color;
    private String engine;
    private static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

/*    public void showColor() {
        System.out.println("Color of the car: " + color);
    }

    public void changeColor(String newColor) {
        System.out.println("Color of car was changed!");
        int price = 5000;
        this.color = newColor;
        price+= 1000;
    }*/

    void changeColor(String color) {
        System.out.println(this.color);
        this.color = color;
    }

    public static void main(String[] args) {
        Car car = new Car("Red", "V4");
        System.out.println(car.color);
        car.changeColor("Black");
        System.out.println(car.color);
    }
}
