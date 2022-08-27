package Calculator24;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Numbers {
    double[] num = new double[2];

    public void setNum() throws UnknownOperatorException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        num[0] = scanner.nextDouble();
        System.out.println("podaj dzialanie");
        Scanner sc = new Scanner(System.in);
        String act = sc.nextLine();
        System.out.println("podaj druga liczbe");
        num[1] = scanner.nextDouble();


        switch (act) {
            case "+":
                double v = num[0] + num[1];
                System.out.println(v);
                break;
            case "-":
                double z = num[0] - num[1];
                System.out.println(z);
                break;
            case "*":
                double x = num[0] * num[1];
                System.out.println(x);
                break;
            case "/":
                double c = num[0] / num[1];

                if (num[1] == 0) {
                    throw new ArithmeticException("nie dzielimy przez zero");
                }
                System.out.println(c);
                break;
            default:
                throw new UnknownOperatorException("podaj prawidlowe dzialanie");


        }
    }
}













