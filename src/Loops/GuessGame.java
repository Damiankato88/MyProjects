package Loops;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        final int number=500;
        int userInput;
        System.out.println("zgadnij liczbe");
        while((userInput=reader.nextInt())!=number){
            if(userInput>number) {
                System.out.println("za duza");
            }
            else {
                System.out.println("za mala");}
        }
        System.out.println("ok");
        reader.close();
    }
}
