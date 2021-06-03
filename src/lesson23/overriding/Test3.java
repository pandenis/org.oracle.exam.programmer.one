package lesson23.overriding;

public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.eat();
        Employee e1 = new Employee();
        e1.eat();
/*        Employee e2 = new Teacher();
        e2.eat();*/
    }
}

class Food{}
class Fruit extends Food{}

class Employee {
    double salary = 100;
    String name = "Tom";
    int age;
    int experience;
    Food eat() {
        System.out.println("Employee eating");
        Food f = new Food();
        return f;
    }
    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee {

    int numberOfStudents;

    @Override
    Food eat() {
        System.out.println("Teacher eating");
        Fruit f = new Fruit();
        return f;
    }

    void teach() {
        System.out.println("Teach");
    }
}

class A {
    Employee objectCreation() {
        return new Employee();
    }
}

class B extends A {
    @Override
    Teacher objectCreation() {
        return new Teacher();
    }
}
