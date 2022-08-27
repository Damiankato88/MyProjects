package Mapy33;

import java.util.Scanner;

public class CompanyMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numbers(sc);

    }
    static void numbers(Scanner scanner) {
        int choice;
        Company company = new Company();

        do {
            System.out.println("1-dodaj pracownika; 2-wyszukaj pracownika, 3-wyjscie z programu");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("podaj klucz, i dane pracownika: imie, nazwisko, wyplata");
                    company.employeeMap.put(scanner.nextLine(), new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("podaj imie i nazwisko szukanego pracownika");
                    String key = scanner.nextLine();
                    System.out.println("znaleziono pracownika" + key);
                    Employee foundEmployee = company.employeeMap.get(key);
                    System.out.println(foundEmployee);
                    break;
                case 3:
                    System.out.println("koniec programu");
            }
            System.out.println(company.employeeMap);
        }while (choice != 3);
}}
