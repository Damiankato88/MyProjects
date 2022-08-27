package StringiTask23;

import java.util.Scanner;

public class Phraze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc wyrazow");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj " + number + " wyrazy");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            String words = scanner.nextLine();
            int wor = words.length();
            System.out.println(wor);
            builder.append(words.charAt(wor - 1));
        }
        String world = builder.toString();
        System.out.println(world);

    }

}
