package ss4_ClassAndObject.ptb2;

public class QuadracticEquation {
    private double a;
    private double b;
    private double c;

    public QuadracticEquation() {
    }

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double x1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public double x2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public double x() {
        return -b / (2 * a);
    }
}
