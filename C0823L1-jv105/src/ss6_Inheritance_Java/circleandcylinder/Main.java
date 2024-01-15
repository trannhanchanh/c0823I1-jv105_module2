package ss6_Inheritance_Java.circleandcylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5, "pink");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(6);
        System.out.println(cylinder);
        cylinder = new Cylinder(4, "orange", 6);
        System.out.println(cylinder);
    }
}
