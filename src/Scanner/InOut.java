package Scanner;

import java.util.Locale;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Wprowadz pierwsza liczbe");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("Wprowadz typ dzialania: +,-,/,*");
        String type = input.nextLine();

        System.out.println("Wprowadz druga liczbe");
        double b = input.nextDouble();
        input.close();

        Action action = new Action();
        double result = action.calculate(a, b, type);
        System.out.println("Wynik dzialania to " + result);

    }
}
