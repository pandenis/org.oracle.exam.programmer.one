package lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Monday") {
            case "Monday":

            case "Wednesday":

            case "Thursday":
                System.out.println("Work till 18:00");
                break;
            case "Friday":
                System.out.println("Work till 15:00");
                break;
            case "Saturday":

            case "Sunday":
                System.out.println("Rest day");
            default:
                System.out.println("This day is not exists");

        }
    }
}
