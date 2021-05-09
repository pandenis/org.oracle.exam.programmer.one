package lesson08.homework0802;

public class Circle {
    static final double pi = 3.14;


    double squareCalc (int r) {
        return pi * r * r;
    }

    static double circumferenceCalc (int r) {
        return 2 * (pi * r + r) * r;
    }

    void printCircle(int r) {

        System.out.println("The radius of circle is: " + r);
        System.out.println("The square of circle when radius is" + r + "equal to" + squareCalc(r));
        System.out.println("The circumference of circle when radius is" + r + "equal to" + circumferenceCalc(r));
    }
}
