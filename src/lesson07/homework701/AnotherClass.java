package lesson07.homework701;

public class AnotherClass {
    public static void main(String[] args) {
        Employee employee = new Employee(200, 1);
        String surname = employee.surname;
        int id = employee.id;
//        double salary = employee.salary;

        System.out.println(surname);
        System.out.println(id);
//      System.out.println(salary);

//      employee.salaryPrint();
        employee.idPrint();
        employee.surnamePrint();

    }
}
