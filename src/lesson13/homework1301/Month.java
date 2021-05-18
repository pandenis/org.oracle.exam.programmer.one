package lesson13.homework1301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Month {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int param = Integer.parseInt(reader.readLine());
        
        month(param);
    }

    static void month(int monthNumber) {

        switch(monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("The month doesn't exists!");
        }
    }
}
