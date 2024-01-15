package ss4_ClassAndObject.stopwatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.getRadius());
            System.out.println(circle.getArea());
            Circle circle1 = new Circle(4.5);
            System.out.println(circle1.getRadius());
            System.out.println(circle1.getArea());
        }
    }
}
