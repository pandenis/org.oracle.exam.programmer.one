package lesson07;

public class AnotherClass {
    public static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}
