package ComputerShop21;

import java.util.Scanner;

public class NotebookShop {

    public static void main(String[] args) {

        DataStore computers = new DataStore();
        computers.getInfo();
        computers.checkAvailability();
        System.out.println("wprowadz nowy komputer wcisnij 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            computers.addComputer();
            computers.getInfo();

        } else {
            System.out.println("koniec");
        }
    }
}
