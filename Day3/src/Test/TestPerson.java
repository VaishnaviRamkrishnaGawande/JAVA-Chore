package Test;

import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person(95, "Vaishnavi", "44444", new Date(10/07/2002));
        System.out.println(p);

        Person p1 = new Person(96, "Vaish", "33333", new Date());
        System.out.println(p1);
    }
}