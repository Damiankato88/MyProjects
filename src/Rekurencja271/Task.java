package Rekurencja271;

public class Task {
    public static void main(String[] args) {
        int number=factorial(5);
        System.out.println(number);
    }
    static int factorial(int n){
        return n>1 ? n*(n-1):n;
    }
}
