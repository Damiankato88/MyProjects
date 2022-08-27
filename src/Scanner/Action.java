package Scanner;

public class Action {

    public double calculate(double a, double b, String type) {

        double result = 1;

        switch (type) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "/":
                result = a / b;
                break;

            case "*":
                result = a * b;
                break;

            default:
                System.out.println("nierozpoznany znak");
        }
        return result;

    }
}