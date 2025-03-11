import java.util.*;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book[Title=" + title + ", Author=" + author + ", Price=" + price + "]";
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book specificBook = new Book("Java Programming", "James Gosling", 39.99);
        System.out.println(defaultBook);
        System.out.println(specificBook);
    }
}
