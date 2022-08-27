package Warehouse18;

public class Test {
    public static void main(String[] args) {

        Tire tire = new Tire("3444", "java", "yato", "215", "55");

        ExhaustPart exhaustPart = new ExhaustPart("5643", "java", "tato", false);
        System.out.println(tire);
        System.out.println(exhaustPart);
    }
}
