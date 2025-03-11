import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        emp.name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        emp.id = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        emp.salary = scanner.nextDouble();

        emp.displayDetails();

        scanner.close();
    }
}
