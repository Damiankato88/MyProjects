package KlasyAbstrakcyjne25;

import java.util.Scanner;

public class Cout {
    public void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("parametry jakiego ksztaltu chcesz obliczyć t,r,c");
        String choice = scanner.nextLine();

        switch (choice) {
            case "t":
                System.out.println("podaj h,a,b,c");
                Shape triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                System.out.println("pole=" + triangle.calculateArea() + "obwod=" + triangle.calculatePerimetr());
                break;
            case "r":
                System.out.println("podaj a i b");
                Shape rect = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

                System.out.println("pole=" + rect.calculateArea() + "obwod=" + rect.calculatePerimetr());
                break;
            case "c":
                System.out.println("podaj r");
                Shape circle = new Circle((scanner.nextDouble()));
                System.out.println("pole=" + circle.calculateArea() + "obwod=" + circle.calculatePerimetr());
                break;
            default:
                System.out.println("nieprawidlowy ksztalt");
        }
        scanner.close();
    }
}