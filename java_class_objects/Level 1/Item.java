import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    void calculateTotalCost(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        item.price = scanner.nextDouble();

        item.displayItemDetails();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        item.calculateTotalCost(quantity);

        scanner.close();
    }
}
