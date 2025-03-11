import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    CartItem item1, item2, item3;
    int itemCount = 0;

    void addItem(CartItem item) {
        if (itemCount == 0) {
            item1 = item;
        } else if (itemCount == 1) {
            item2 = item;
        } else if (itemCount == 2) {
            item3 = item;
        }
        itemCount++;
    }

    void removeItem(String itemName) {
        if (itemCount == 0) {
            System.out.println("No items to remove.");
            return;
        }
        if (itemCount == 1 && item1.itemName.equals(itemName)) {
            item1 = null;
        } else if (itemCount == 2 && item2.itemName.equals(itemName)) {
            item2 = null;
        } else if (itemCount == 3 && item3.itemName.equals(itemName)) {
            item3 = null;
        }
        itemCount--;
    }

    void displayTotalCost() {
        double totalCost = 0;
        if (item1 != null) totalCost += item1.calculateCost();
        if (item2 != null) totalCost += item2.calculateCost();
        if (item3 != null) totalCost += item3.calculateCost();
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  

        CartItem item = new CartItem(itemName, price, quantity);
        cart.addItem(item);

      
        System.out.print("Enter item name to remove: ");
        String itemToRemove = scanner.nextLine();
        cart.removeItem(itemToRemove);

        cart.displayTotalCost();

        scanner.close();
    }
}
