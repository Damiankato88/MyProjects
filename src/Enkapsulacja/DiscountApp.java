package Enkapsulacja;

class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", true);
        double price1 = 100;
        Client client2 = new Client(null, "nowak", false);
        double price2 = 1100;
        Client client3 = new Client("tomasz", "joch", false);
        double price3 = 800;
        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);
        double priceDiscount3 = discountService.calculateDiscountPrice(client3, price3);
        PrintService printService = new PrintService();
        printService.screenPrintService(client1, price1, priceDiscount1);
        printService.screenPrintService(client2, price2, priceDiscount2);
        printService.screenPrintService(client3, price3, priceDiscount3);


    }
}

