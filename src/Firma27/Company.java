package Firma27;

import java.io.Serializable;
import java.util.Scanner;

public class Company implements Serializable {


    public Object addEmployee() {
        Employee[] person = new Employee[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj pierwszego pracownika");
        person[0] = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println("podaj drugiego pracownika");
        person[1] = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println("podaj trzeciego pracownika");
        person[2] = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine());


        return person;
    }
}