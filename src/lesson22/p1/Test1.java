package lesson22.p1;

import lesson22.Man;

public class Test1 {
    public static void main(String[] args) {

            Man man = new Man("m");
            man.setName(new StringBuilder("Peter"));
            man.setAge(25);
            man.setWeight(60);

            man.getName().append("!!!");
            System.out.println(man.getName());

/*            System.out.println(man.getAge());
            System.out.println(man.getWeight());*/
    }
}
