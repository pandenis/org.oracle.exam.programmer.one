package lesson18;

public class Homework1802 {
    public void showArray(String[][] strings) {
        StringBuilder output = new StringBuilder("{");
        for (String[] string : strings) {
            output.append(" {");
            for (int j = 0; j < string.length - 1; j++) {
                String str = string[j];
                output.append(str).append(", ");
            }
            for (int j = string.length - 1; j < string.length; j++) {
                output.append(string[j]).append("} ");
            }
        }
        output.append("}");

        System.out.println(output);
    }

    public static void main(String[] args) {
        Homework1802 hw = new Homework1802();

        String[][] strings = {{"el00", "ell01"}, {"ell10", "ell11"}, {"ell20", "ell21", "ell22"}};

        hw.showArray(strings);
    }
}
