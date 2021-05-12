package lesson12.homework1201;

import lesson11.Student;

public class StudentTest {

    static void equals1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Both students are equal!");
        } else {
            System.out.println("Students are different!");
        }
    }

    static void equals2(Student st1, Student st2) {
        String str = "";
        if (!st1.name.equals(st2.name)) {
            str += "The names of students are different.";

            if (!(st1.course == st2.course)) {
                str += " The courses of students are different.";

                if (!(st1.grade == st2.grade)) {
                    str += " The grades of students are different.";
                    System.out.println(str);
                }
            }
        }
        else {
            System.out.println("Both students are equal!");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Jhon", 3 , 9.5);
        Student st2 = new Student("Petr", 1 , 5.3);
        Student st3 = new Student("Petr", 1 , 5.3);

        equals1(st1, st2);
        System.out.println("/-----------------------------/");
        equals1(st2, st3);

        System.out.println("/------------equals2------------/");

        equals2(st1, st2);
        System.out.println("/-----------------------------/");
        equals2(st2, st3);
    }
}
