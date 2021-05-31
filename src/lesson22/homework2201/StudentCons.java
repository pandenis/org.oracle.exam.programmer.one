package lesson22.homework2201;

public class StudentCons {
    private StringBuilder name;
    private int course;
    private int grade;

    public StudentCons(StringBuilder name, int course, int grade) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("The name length mast be greater than 3");
        }

        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("The course number is wrong");
        }

        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("The " + grade + " is wrong grade");
        }
    }

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo(){
        System.out.println("The name of the student is " + getName());
        System.out.println("The course is " + getCourse());
        System.out.println("The grade is " + getGrade());
    }
}
