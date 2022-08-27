package PizzeriaShop;


import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Dostępne pizze:");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz pizze");
        String choice = scanner.nextLine();
        Pizza pizza = Pizza.valueOf(choice);
        System.out.println("wybrales pizze " + pizza);
        System.out.println("aby potwierdzic nacisnij 1");
        int confirmation = scanner.nextInt();
        if (confirmation == 1) {
            System.out.println("POTWIERDZAM");
        } else {
            System.out.println("WROC DO POCZATKU");
        }


    }
}
