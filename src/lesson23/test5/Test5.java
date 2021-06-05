package lesson23.test5;

public class Test5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.sleep(); //e s
        Employee t = new Teacher();
        t.sleep(); // t s

    }

}
class Food{}
class Fruit extends Food {}

class Employee {
    double salary = 100;
    String name = "Tom";

   public Food eat() {
        System.out.println("Employee eating");
        Food f = new Food();
        return f;
    }

    final void sleep() {
        System.out.println("Employee Sleep");
    }
}


class Teacher extends Employee {

    @Override
    public Food eat() {
        System.out.println("Teacher eating");
        Fruit f = new Fruit();
        return f;
    }

/*    @Override : parent method is final
    protected void sleep() {
        System.out.println("Teacher sleep!");
    }*/

    void teach() {
        System.out.println("Teach");
    }
}

class T{}

class P extends T {}

