package lesson11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increaser(double d) {
        d = d * 2;
        return d;
    }
    public double salaryIncreaser() {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 100.55);
        double increaser = emp1.increaser(emp1.salary);
        System.out.println(increaser);
        System.out.println(emp1.salary);
        System.out.println("--------------------");
        emp1.salaryIncreaser();
        System.out.println(emp1.salary);
    }
}
