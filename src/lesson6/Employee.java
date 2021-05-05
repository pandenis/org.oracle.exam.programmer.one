package lesson6;

public class Employee {
    Employee(int id, String surname, int age) {
        this(id, surname, age, 0.0, null);
    }

    Employee(String surname, int age) {
        this(0, surname, age, 0.0, null);
    }

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department =department;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
    }

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Tom", 25);
        System.out.println(employee.surname);
        Employee employee2 = new Employee( "Smith", 22);
        System.out.println(employee2.age);
        Employee employee3 = new Employee(2, "Noah", 40, 254.35, "IT");
        System.out.println(employee3.id + " " + employee3.surname);
    }
}
