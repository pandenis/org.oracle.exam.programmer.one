package lesson13;

public class Test1 {
}

class Student{
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student = new Student(3);

        switch (student.grade) {
            case 2:
                System.out.println("failing grade");
                break;
            case 3:
                System.out.println("middle grade");
                break;
            case 4:
                System.out.println("good grade");
                break;
            case 5:
                System.out.println("highest grade");
                break;
            default:
                System.out.println("Incorrect grade");
        }
        /*if(student.grade == 2) {
            System.out.println("failing grade");
        } else if (student.grade == 3) {
            System.out.println("middle grade");
        } else if (student.grade == 4) {
            System.out.println("good grade");
        } else if (student.grade == 5) {
            System.out.println("highest grade");
        } else {
            System.out.println("incorrect grade!");
        }*/
    }
}
