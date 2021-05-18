package lesson14.homework1401;

public class Main {
    public void time() {
        HOURS:
        for (int h = 0; h < 6; h++) {

            MINUTES:
            for (int m = 0; m < 60; m++) {
                if (h > 1 && m % 10 == 0) {
                    break HOURS;
                }
                SECONDS:
                for (int ss = 0; ss < 60; ss++) {
                    String sH = "";
                    String sM = "";
                    String sSs = "";

                    if (ss * h > m) {
                        System.out.println("-------------");
                        continue MINUTES;}

                    sH = "0" + h;

                    if (m < 10) {
                        sM = "0" + m;
                    } else {
                        sM = sM + m;
                    }

                    if (ss < 10) {
                        sSs = "0" + ss;
                    } else {
                        sSs = sSs + ss;
                    }

                    System.out.println(sH + ":" + sM + ":" + sSs);

                }
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.time();
    }
}
