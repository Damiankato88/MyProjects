package random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int x = r.nextInt(11);
        int y = r.nextInt(11);
        if (x > y) {
            System.out.println(x + " jest wieksze niz " + y);

        } else {
            System.out.println(x + " jest mniejsze niz " + y);
        }
        //part two
        if (x * 2 > y) {
            System.out.println(x + " razy dwa " + " jest wieksze niz " + y);

        } else {
            System.out.println(x + " razy dwa jest mniejsze niz " + y);
        }

        //part 3
        if (y < x + 3 && y > x / 2) {
            System.out.println(y + " jest mniejsze " + x + 3 + " i jest wieksze od" + x / 2);

        } else {
            System.out.println(y + " jest wieksze " + x + 3 + " i jest mniejsze od" + x);
        }

        if (x * y % 2 == 0) {
            System.out.println(x + " razy " + y + " jest parzysty");

        } else {
            System.out.println(x + " razy " + y + "  jest nieparzysty");
        }
    }
}


