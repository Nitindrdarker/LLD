class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class PriceCalculator {

    public double calculateDiscountedPrice(Book book, double discountPercent) {
        double discountAmount = book.getPrice() * discountPercent / 100;
        return book.getPrice() - discountAmount;
    }
}

class BookPrinter {

    public void print(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}

class BookRepository {

    public void save(Book book) {
        // simulate DB save
        System.out.println("Book saved to database: " + book.getTitle());
    }
}

public class SingleResponsiblityPrinciple {
    public static void main(String[] args) {

        Book book = new Book("Clean Code", "Robert Martin", 500);

        PriceCalculator calculator = new PriceCalculator();
        double finalPrice = calculator.calculateDiscountedPrice(book, 10);

        System.out.println("Discounted Price: " + finalPrice);

        BookPrinter printer = new BookPrinter();
        printer.print(book);

        BookRepository repository = new BookRepository();
        repository.save(book);
    }
}
