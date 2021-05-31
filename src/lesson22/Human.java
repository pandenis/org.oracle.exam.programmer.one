package lesson22;

public class Human {
/*    public Human(String name) {
        this.name = name;
    }*/

    private String name = "Tom";
    protected String nikName = "TomTom";
    public static int salary = 150;
    public void work() {
        System.out.println("Working");
    }

    public static void rest() {
        System.out.println("Rest");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Human {
    public static void main(String[] args) {
        lesson22.p1.Student s = new lesson22.p1.Student();
        System.out.println(s.getName());
        System.out.println(lesson22.p1.Student.salary);
        s.work();
        lesson22.p1.Student.rest();

    }
}
