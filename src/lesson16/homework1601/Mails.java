package lesson16.homework1601;

public class Mails {

    public void email(String list) {

        list = list.trim();

        for (int i = 0; i < list.length(); i++) {
            char at = list.charAt(i);

            if (at == '@') {
                int dot = list.indexOf('.');
                String domain = list.substring(++i, dot);
                System.out.println(domain);

                list = list.substring(list.indexOf(';') + 1);

                i = 0;
            }
        }
    }

    public static void main(String[] args) {
        Mails mails = new Mails();
        mails.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
