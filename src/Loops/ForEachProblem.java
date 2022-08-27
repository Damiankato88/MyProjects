package Loops;

import java.util.Scanner;

public class ForEachProblem {
    public static void main(String[] args) {
        int[] numbers=new int[3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< numbers.length;i++){
            System.out.println("podaj liczbe");
            numbers[i]= sc.nextInt();
        }
        for (int tmp:numbers){
            System.out.println(tmp);
        }
sc.close();}
}
