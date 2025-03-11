import java.util.ArrayList;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private String orderId;
    private ArrayList<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product: " + product.getProductName() + ", Price: " + product.getPrice());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " has placed an order.");
        order.showOrderDetails();
    }
}

class ECommercePlatform {
    public static void main(String[] args) {
        Customer customer = new Customer("John");

        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);

        Order order = new Order("ORD123");

        order.addProduct(product1);
        order.addProduct(product2);

        customer.placeOrder(order);
    }
}
