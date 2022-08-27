package HospitalVisite;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        Hospital hospital = new Hospital();
        do {
            System.out.println("podaj liczbe");
            String number = sc.nextLine();
            switch (number) {
                case "0":
                    end = true;
                    break;
                case "1":
                    System.out.println("podaj imie");
                    String firstName = sc.nextLine();
                    System.out.println("podaj nazwisko");
                    String lastName = sc.nextLine();
                    System.out.println("podaj pesel");
                    String pesel = sc.nextLine();
                    hospital.addPatient(new Patient(firstName, lastName, pesel));
                    break;
                case "2":
                    hospital.viewPatient();
                    break;
            }
        } while (!end);
    }
}