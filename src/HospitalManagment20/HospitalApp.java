package HospitalManagment20;


import java.util.Scanner;

public class HospitalApp {


    public static void main(String[] args) {
        Hospital people = new Hospital();
        people.getInfo();
        System.out.println("wprowadz nowa osobe wcisnij 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            people.addPerson();
            people.getInfo();
        } else {
            System.out.println("koniec");

        }
    }
}

