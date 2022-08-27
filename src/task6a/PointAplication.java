package task6a;


import task6a.task6b.PointController;

import java.util.Scanner;

public class PointAplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean end = false;
        final int ADD_X = 0;
        final int ADD_Y = 1;
        final int SUB_X = 2;
        final int SUB_Y = 3;
        Point point = new Point();
        PointController pointController = new PointController();

        while (!end) {
            String userInput = scanner.nextLine();

            switch (userInput.toLowerCase()) {
                case "w":
                    pointController.pointMove(point, ADD_X);
                    break;
                case "s":
                    pointController.pointMove(point, SUB_X);
                    break;
                case "a":
                    pointController.pointMove(point, SUB_Y);
                    break;
                case "d":
                    pointController.pointMove(point, ADD_Y);
                    break;
                case "x":
                    end = true;
                    break;
                default:
                    System.out.println("wprowadzono zle dane");
            }
            System.out.println(point.toString());
        }


        System.out.println("wartosci poczatkowe punktu");
        System.out.println(point.toString());


        pointController.pointMove(point, ADD_Y);
        System.out.println("po zmianie lokalizacji");
        System.out.println(point.toString());


    }


}