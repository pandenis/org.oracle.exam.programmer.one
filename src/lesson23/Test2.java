package lesson23;

public class Test2 {
/*
    public Object abc(){
        return new Doctor();
    }
*/

    public static void main(String[] args) {
/*        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();*/

        Employee employee1 = new Doctor();
        System.out.println(employee1.salary);
        System.out.println(employee1.name);
        System.out.println(employee1.age);
        System.out.println(employee1.experience);
        employee1.eat();
        employee1.sleep();

        Employee employee2 = new Teacher();
        Employee employee3 = new Driver();
    }
}

class Employee {
    double salary = 100;
    String name = "Tom";
    int age;
    int experience;
    void eat() {
        System.out.println("Eating");
    }
    void sleep() {
        System.out.println("Sleep");
    }
}
class Doctor extends Employee{
    void toHeal(){
        System.out.println("Heals");
    }
}

class Teacher extends Employee {

    int numberOfStudents;

    void teach() {
        System.out.println("Teach");
    }
}

class Driver extends Employee {

    String nameOfCar;

    void drive() {
        System.out.println("Drive");
    }
}

class Surgeon extends Doctor{
    String scalpel;
    void operates() {
        System.out.println("Operates");
    }
}