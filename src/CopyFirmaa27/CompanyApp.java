package CopyFirmaa27;

import java.util.Scanner;

public class CompanyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Save save = new Save();
        System.out.println("zapisac-1, wczytac-2");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> save.save();
            case "2" -> Load.load();
            default -> System.out.println("nieprawidlowy wybor");
        }


    }
}




