package lesson15.homework1501;

public class Main {
    public static void main(String[] args) {

        int hour = 0;
        while (hour < 24) {
            String st_hour = (hour < 10) ? "0" + hour : "" + hour;

            hour++;

            int minute= -1;
            do {
                minute++;

                String st_minute = (minute < 10) ? "0" + minute : "" + minute;

                int second = 0;

                while (second < 60) {
                    String st_second = (second < 10) ? "0" + second : "" + second;

                    System.out.println(st_hour + ":" + st_minute + ":" + st_second);

                    second++;
                }
            } while (minute < 59);
        }
    }
}
