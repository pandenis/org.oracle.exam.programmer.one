package lesson16.homework1601;

public class Mails {

    public void email(String list) {
       for (int i = 0; i < list.length(); i++) {
            String domain = list.substring(list.indexOf("@") + 1,list.indexOf(";"));
            System.out.println(domain);

           INNER: if (list.charAt(i) == ';') {
                String temp = list.substring(list.indexOf(i));
                System.out.println(temp);
                break INNER;
            }
        }


    }



    public static void main(String[] args) {
        Mails mails = new Mails();
        mails.email("ya@yahoo.com; on@mail.com; ona@gmail.com");
    }
}
