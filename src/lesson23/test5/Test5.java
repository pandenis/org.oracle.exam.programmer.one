package lesson23.test5;

public class Test5 {

}
class Food{}
class Fruit extends Food {}

class Employee {
    double salary = 100;
    String name = "Tom";

    Food eat() {
        System.out.println("Employee eating");
        Food f = new Food();
        return f;
    }

    private void sleep() {
        System.out.println("Sleep");
    }
}


class Teacher extends Employee {

    @Override
    public Food eat() {
        System.out.println("Teacher eating");
        Fruit f = new Fruit();
        return f;
    }



    void teach() {
        System.out.println("Teach");
    }
}

