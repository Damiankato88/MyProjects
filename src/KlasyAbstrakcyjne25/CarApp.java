package KlasyAbstrakcyjne25;

public class CarApp {
    public static void main(String[] args) {
        Vehicle vehicle=new Car();
        vehicle.speedUp();
        System.out.println("samochod jedzie z predkoscia "+vehicle.getSpeed());
    }
}
