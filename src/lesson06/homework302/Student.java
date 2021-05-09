package lesson06.homework302;

public class Student {
    int id;
    int gradeSheet;
    String firstName;
    String secondName;
    int yearOfStudy;
    double avgMath;
    double avgEconomic;
    double avgForeignLanguage;

    Student(int id, int gradeSheet, String firstName, String secondName, int yearOfStudy,
            double avgMath, double avgEconomic, double avgForeignLanguage) {
        this.id = id;
        this.gradeSheet = gradeSheet;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfStudy = yearOfStudy;
        this.avgMath = avgMath;
        this.avgEconomic = avgEconomic;
        this.avgForeignLanguage = avgForeignLanguage;
    }

    Student(int id) {
        this(id, 0, null, null, 0,
                0.0, 0.0, 0.0);
        this.id = id;
    }

    Student(int id, String firstName, String secondName, int yearOfStudy) {
        this(id, 0, null, null, 0, 0.0, 0.0,
                0.0);
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfStudy = yearOfStudy;
    }
    Student() {
    }


}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student(001, 2001, "John", "Smith", 2015,
                6.5, 7.6, 8.5);
        Student student2 = new Student(002, "Tom", "Thomson", 2001);
        Student student3 = new Student(003);
        Student student4 = new Student();
    }
}
