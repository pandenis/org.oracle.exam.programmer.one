package lesson08;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student number " + count + " was created");

    }

    public static void showCount() {
        System.out.println("\nSum of created students is: " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the student club!");
    }

    void adc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        //a++;
        Student st2 = new Student("Pet", 2);
        st2.a++;
    }

    public static void main(String[] args) {
/*        System.out.println(count);

        Student student1 = new Student("Jhon", 1);
        Student student2 = new Student("Tom", 2);
        Student student3 = new Student("Susan", 4);

        showCount();*/
        //System.out.println(student1.count);
    }

}

class StudentTest{
    public static void main(String[] args) {
/*        Student student1 = new Student("Jhon", 1);
        Student student2 = new Student("Tom", 2);
        Student student3 = new Student("Susan", 4);

        System.out.println(Student.count);*/
    }
}
