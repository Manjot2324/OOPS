import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book[Title: " + title + ", Author: " + author + "]";
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library1 = new Library("Central Library");
        Library library2 = new Library("City Library");

        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Design Patterns", "Erich Gamma");

        library1.addBook(book1);
        library2.addBook(book2);

        library1.displayBooks();
        library2.displayBooks();
    }
}
