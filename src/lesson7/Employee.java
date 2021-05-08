package lesson7;

public class Employee {
    public double salary;

    public void doubleSalary() {
        System.out.println("New salary: " + salary * 2);
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(501);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }

}
