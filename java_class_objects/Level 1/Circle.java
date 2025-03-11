import java.util.Scanner;

class Circle {
    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Enter radius of the circle: ");
        circle.radius = scanner.nextDouble();

        circle.calculateArea();
        circle.calculateCircumference();

        scanner.close();
    }
}
