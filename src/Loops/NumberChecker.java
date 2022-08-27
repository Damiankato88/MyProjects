package Loops;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int tmp = sc.nextInt();

            if (tmp % 2 == 0) {
                System.out.println("liczba" + tmp + "jest parzysta");
            } else {
                System.out.println("liczba" + tmp + "jest nieparzysta");
            }
        }
        sc.close();
    }
}

