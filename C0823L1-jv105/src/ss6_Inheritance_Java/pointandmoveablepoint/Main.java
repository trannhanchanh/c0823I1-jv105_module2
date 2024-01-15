package ss6_Inheritance_Java.pointandmoveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(1.0f, 2.0f);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(3.0f, 4.0f);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
