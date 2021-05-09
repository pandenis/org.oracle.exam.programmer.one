package lesson05.homework503;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary() {
        System.out.println(salary * 2);
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee(65, "John", 55, 20500, "dep1");
        Employee employee2 = new Employee(45, "Tom", 45, 21500, "dep2");
        employee1.doubleSalary();
        employee2.doubleSalary();
    }
}
