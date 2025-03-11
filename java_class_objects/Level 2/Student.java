import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Student Name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        student.rollNumber = scanner.nextInt();

        System.out.print("Enter Marks: ");
        student.marks = scanner.nextDouble();

        student.displayDetails();

        scanner.close();
    }
}
