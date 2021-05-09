package lesson07;

public class Employee {
     double salary;

    protected void doubleSalary() {
        double res = salary * 2;
        System.out.println("New salary: " + res);
    }

    Employee(double salary) {
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
