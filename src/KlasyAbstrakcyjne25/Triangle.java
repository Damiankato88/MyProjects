package KlasyAbstrakcyjne25;

public class Triangle implements Shape {
    private double h;
    private double a;
    private double b;
    private double c;

    public Triangle(double h, double a, double b, double c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return (a/2)*h;
    }

    @Override
    public double calculatePerimetr() {
        return a+b+c;
    }
}
