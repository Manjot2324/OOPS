import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter Book Title: ");
        book.title = scanner.nextLine();

        System.out.print("Enter Book Author: ");
        book.author = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        book.price = scanner.nextDouble();

        book.displayDetails();

        scanner.close();
    }
}
