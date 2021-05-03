package lesson5.homework502;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.avgEconomic = 5.7;
        student1.avgForeignLanguage = 6.9;
        student1.avgMath = 7;

        student2.avgEconomic = 8.8;
        student2.avgForeignLanguage = 8.9;
        student2.avgMath = 7.4;

        student3.avgEconomic = 5.7;
        student3.avgForeignLanguage = 6.4;
        student3.avgMath = 7.9;

        avgCalculation(student1);
        avgCalculation(student2);
        avgCalculation(student3);

    }

    static public void avgCalculation(Student student) {
        System.out.println((student.avgEconomic + student.avgMath + student.avgForeignLanguage) / 3);
    }
}
