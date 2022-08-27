package Kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Podaj liczby:");
        Scanner sc = new Scanner(System.in);
        numbers(sc);
    }

    static void numbers(Scanner scanner) {
        ArrayList<String> list = new ArrayList<>();
        do {
            list.add(scanner.next());

        } while (!list.get(list.size() - 1).equals("exit"));
        list.remove(list.size() - 1);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int in = 0;
            try {
                in = Integer.parseInt(list.get(i));
            } catch (NumberFormatException ex) {
                System.out.println("nieprawidlowy format");
            }
            sum = sum + in;
        }
        System.out.println(list);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            builder.append(list.get(i));
            builder.append("+");
        }
        System.out.println(builder + list.get(list.size() - 1) + "=" + sum);
        scanner.close();
    }
}

