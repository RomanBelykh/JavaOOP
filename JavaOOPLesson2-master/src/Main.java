import interfaces.Human;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Men men = new Men();
        Women women = new Women();

        men.setName("Ivan");
        men.setBirthday("12/03/1990");
        men.setAge(32);
        men.setNotSick(true);
        System.out.println(men.toString());

        women.setName("Marisha");
        women.setBirthday("25/09/1996");
        women.setAge(26);
        women.setChildren(15);
        System.out.println(women.toString());

        men.sleep(true);
        women.sleep(false);

        System.out.println(men.isFather());

    }
}