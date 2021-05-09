package lesson07.homework701;

public class Employee {
    private double salary;
    String surname;
    public int id;

    private void salaryPrint(){
        System.out.println(salary);
    }

    void surnamePrint() {
        System.out.println(surname);
    }

    public void idPrint() {
        System.out.println(id);
    }


    private Employee(double salary, String surname, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public Employee(int id){
        this(0.0, null, id);

    }
    Employee(double salary, int id){
        this(salary, null, id);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(200, 1);
        String surname = employee.surname;
        int id = employee.id;
        double salary = employee.salary;

        System.out.println(surname);
        System.out.println(id);
        System.out.println(salary);

        employee.salaryPrint();
        employee.idPrint();
        employee.surnamePrint();
    }
}
