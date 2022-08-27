
package Enkapsulacja;


public class PrintService {


    public void screenPrintService(Client client, double price, double calculateDiscountPrice) {
        if (client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("Witaj" + client.getFirstName() + client.getLastName());
        }

        if (client.getLastName() == null) {
            System.out.println("Witaj" + client.getFirstName());

        }
        if (client.getFirstName() == null) {
            System.out.println("Witaj" + client.getLastName());

        }
        System.out.println("kwota przed rabatem" + price);
        System.out.println("kwota po rabacie" + calculateDiscountPrice);
    }
}









