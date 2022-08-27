package task3;

public class Calculate {
    public static void main(String[] args) {
        double x = 4.1;
        double y = 6;

        System.out.println("wyniki dzialan to");
        Calculator action = new Calculator();
        System.out.println(action.add(x, y));
        System.out.println(action.subtract(x, y));
        System.out.println(action.multiply(x, y));
        System.out.println(action.divide(x, y));


    }
}
