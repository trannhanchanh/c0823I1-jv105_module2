package ss4_ClassAndObject.fan;

public class Main {
    public static void main(String[] args) {
        // int speed, boolean on, double radius, String color
       Fan fan1 = new Fan(3, true, 10, "yellow");
       Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println("Fan 1 là:" + fan1.toString());
        System.out.println("Fan 2 là:" + fan2.toString());

    }
}
