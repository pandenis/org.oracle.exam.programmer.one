package lesson7.homework701.packg;

import lesson7.homework701.*;

public class TestA {
    public static void main(String[] args) {
        Employee employee = new Employee(2);
//      String surname = employee.surname;
        int id = employee.id;
//      double salary = employee.salary;

//      System.out.println(surname);
        System.out.println(id);
//      System.out.println(salary);

//      employee.salaryPrint();
        employee.idPrint();
//      employee.surnamePrint();

    }
}
