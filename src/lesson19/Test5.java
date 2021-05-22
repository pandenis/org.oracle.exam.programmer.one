package lesson19;

public class Test5 {
    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"Math Analytics", "Philosophy"};

        for (String student : students) {
            for (String exam : exams) {
                System.out.println(student + " " + exam);
            }
        }

    }
}
