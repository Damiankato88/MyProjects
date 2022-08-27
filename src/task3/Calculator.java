package task3;

public class Calculator {
    double add(double x, double y) {
        return x + y;
    }


    double subtract(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;

        }

    }


}