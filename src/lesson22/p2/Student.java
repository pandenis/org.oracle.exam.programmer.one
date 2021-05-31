package lesson22.p2;

public class Student extends Human {

    Student() {
        this(5);
        System.out.println("Hello");
    }

    Student(int i) {
        super("Pit");
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}
