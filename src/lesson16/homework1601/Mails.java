package lesson16.homework1601;

public class Mails {

    public void email(String list) {

        list = list.trim();

        for (int i = 0; i < list.length(); i++) {
            char a = list.charAt(i);

            if (a == '@') {
                int s = list.indexOf(';');
                String domain = list.substring(0, s).substring(++i);
                System.out.println(domain);

                list = list.substring(++s);

                i = 0;
            }
        }
    }

    public static void main(String[] args) {
        Mails mails = new Mails();
        mails.email("ya@yahoo.com; on@mail.com; ona@gmail.com;");
    }
}
