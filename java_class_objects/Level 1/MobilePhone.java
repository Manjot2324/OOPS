import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Phone Brand: " + brand);
        System.out.println("Phone Model: " + model);
        System.out.println("Phone Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MobilePhone phone = new MobilePhone();

        System.out.print("Enter Phone Brand: ");
        phone.brand = scanner.nextLine();

        System.out.print("Enter Phone Model: ");
        phone.model = scanner.nextLine();

        System.out.print("Enter Phone Price: ");
        phone.price = scanner.nextDouble();

        phone.displayDetails();

        scanner.close();
    }
}
