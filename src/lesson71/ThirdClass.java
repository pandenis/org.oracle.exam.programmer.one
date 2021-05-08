package lesson71;

import lesson7.*;

public class ThirdClass {
    public static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}
