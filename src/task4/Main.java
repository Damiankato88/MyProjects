package task4;

import task3.Calculator;

public class Main {
    public static void main(String[] args) {
        double x = 7;

        Metric action = new Metric();
        System.out.println(x + "m =");
        System.out.println(action.metr(x) + "cm");
        System.out.println(x + "m =");
        System.out.println(action.cm(x) + "mm");


        double z = 100;
        System.out.println(z + "cm =");
        System.out.println(action.cNm(z) + "m");

        double v = 1000;
        System.out.println(v + "mm =");
        System.out.println(action.mmNm(v) + "m");

        double y = 5;
        Time clock = new Time();
        System.out.println(y + "h=");
        System.out.println(clock.hour(y) + "min");

        double m=59;
        System.out.println(m + "min=");
        System.out.println(clock.min(m) + "s");

        double s=360;
        System.out.println(s + "sec=");
        System.out.println(clock.sec(s) + "ms");
    }

}
