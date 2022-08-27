package ComputerShop21;


import java.util.Scanner;

public class DataStore {
    Computer[] computers = new Computer[5];

    {
        computers[0] = new Computer("toshiba", 45);
        computers[1] = new Computer("toshiba", 45);
        computers[2] = new Computer("toshiba", 45);
        computers[3] = new Computer("toshiba", 45);
        computers[4] = new Computer("ibm", 47);
    }


    public void getInfo() {
        for (Computer comp : computers) {
            System.out.println(comp);
        }
    }

    public void addComputer() {

        Scanner input = new Scanner(System.in);
        System.out.println("podaj pozycje");
        int position = input.nextInt();
        input.nextLine();
        System.out.println("Wprowadz producenta");
        String prod = input.nextLine();
        System.out.println("Wprowadz model");
        int mod = input.nextInt();
        computers[position] = new Computer(prod, mod);


    }
    int numbers;

    public void checkAvailability() {
        int sum = 0;

        for (int i = 0; i < computers.length; i++) {

            boolean computerEquals = computers[0].equals(computers[i]);
            if (computerEquals == true) {
                sum += 1;
                System.out.println(computerEquals);
            }


        }
        System.out.println("liczba komputerow= " + sum);
    }}

