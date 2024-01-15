package ss5_static_java.modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Circle circle1 = new Circle(4.5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
