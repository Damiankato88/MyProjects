package task1;

public class Part1 {
    public static void main(String[] args) {

        int x = 4;
        int y = 8;
        //part one
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