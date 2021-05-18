package lesson15;

public class Test10 {
    public static void main(String[] args) {

        OUTER:
        for (int hours = 0; hours < 24; hours++) {

            String minute;
            String hour;
            int minutes = 0;

            hour = (hours < 10)? "0" + hours : "" + hours;

        INNER:
        while (minutes < 60) {

                minute = (minutes < 10)? "0" + minutes : "" + minutes;

                System.out.println(hour + ":" + minute);

                minutes++;
                }
        }
        
    }
}
