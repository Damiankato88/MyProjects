package Loops;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe liczb");
        int countNumber = input.nextInt();
        int sum = 0;
        while (countNumber > 0) {
            sum += input.nextInt();
            countNumber--;
        }
        System.out.println("Suma = " + sum);
    }
}




