package lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {
        Student st3 = s1;
        s1 = s2;
        s2 = st3;

        System.out.println(s1.name); //Petr
        System.out.println(s2.name); //Jhon
    }

    public static void changeName(Student s) {
        s.name = "Tom";
    }

    public static void main(String[] args) {

        Student st1 = new Student("Jhon", 3 , 9.5);
        Student st2 = new Student("Petr", 1 , 5.3);
        swap(st1, st2);
        System.out.println("/-------------------------------/");
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println("/-------------------------------/");
        System.out.println(st2.name);

    }
}
