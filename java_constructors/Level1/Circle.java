import java.util.*;

class Circle {
    private double radius;

    public Circle() {
        this(1.0); 
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

    @Override
    public String toString() {
        return "Circle[Radius=" + radius + "]";
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle specificCircle = new Circle(5.0);
        System.out.println(defaultCircle);
        System.out.println(specificCircle);
    }
}
