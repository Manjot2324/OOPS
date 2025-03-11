import java.util.*;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        } else {
            return false;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "LibraryBook[Title=" + title + ", Author=" + author + ", Price=" + price + ", Available=" + available + "]";
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        System.out.println(book1.borrowBook() ? "Book borrowed successfully" : "Book not available");
        System.out.println(book1);
    }
}
