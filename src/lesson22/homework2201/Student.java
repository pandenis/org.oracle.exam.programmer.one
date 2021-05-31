package lesson22.homework2201;

public class Student {
    private StringBuilder name = new StringBuilder("");
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = new StringBuilder(name);
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    private StringBuilder getName() {
        return new StringBuilder(name);
    }

    private int getCourse() {
        return course;
    }

    private int getGrade() {
        return grade;
    }

    public void showInfo(){
        System.out.println("The name of the student is " + getName() + ".");
        System.out.println("The course is " + getCourse() + ".");
        System.out.println("The grade is " + getGrade() + ".");
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student student = new Student();

        student.setName(new StringBuilder("Tom"));
        student.setGrade(9);
        student.setCourse(3);

        student.showInfo();
    }
}
