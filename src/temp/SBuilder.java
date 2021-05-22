package temp;

public class SBuilder {
    public static void main(String[] args) {
        String[] strings = {"Denis", "Tom", "Bob"};

        StringBuilder stringBuilder = new StringBuilder("{");

        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i] + " ,");
        }

        System.out.println(stringBuilder.append("}"));

    }
}
