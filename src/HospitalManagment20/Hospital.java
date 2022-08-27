package HospitalManagment20;


import java.util.Scanner;

public class Hospital {

    Person[] people = new Person[10];

    {


        people[0] = new Doctor("Jan", "kowal", "5500", "1500");
        people[1] = new Nurse("ala", "kot", "3000", "15");
        people[2] = new Nurse("aga", "krzak", "3200", "55");
    }

    public void getInfo() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void addPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("doctor=2, nurse=3");
        int num = input.nextInt();
        System.out.println("podaj pozycje");
        int position = input.nextInt();
        input.nextLine();
        switch (num) {

            case (2) -> {
                System.out.println("podaj imie, nazwisko, wyplata i bonus");
                people[position] = new Doctor(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());

            }
            case (3) -> {
                System.out.println("podaj imie, nazwisko, wyplata i nadgodziny");
                people[position] = new Nurse(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());

            }
        }
    }


}








    

     


        
        

    






