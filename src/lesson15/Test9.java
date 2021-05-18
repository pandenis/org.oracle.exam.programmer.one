package lesson15;

public class Test9 {

    public static void main(String[] args) {

        String sHours = "";
        String sMinutes = "";

        int hours = -1;
        HOURS:
        do {
            hours++;
            if (hours < 10) {
                sHours = "0" + hours;
            } else {
                sHours = "" + hours;
            }

            int minutes = 0;
            MINUTES:
            while (minutes < 60) {
                if (minutes == 20) {
                    break HOURS;
                }
                if (minutes < 10) {
                    sMinutes = "0" + minutes;
                } else {
                    sMinutes = "" + minutes;
                }
                minutes++;
                System.out.println(sHours + ":" + sMinutes);

            }

        } while (hours < 24);
    }
}
