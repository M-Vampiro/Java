import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output:
 * Writer: Susan
 * Writer: Tracy
 * Book Name: Book A, Book Price: 34.9
 * Book Name: Book B, Book Price: 78.9
 * Book Name: Book C, Book Price: 104.9
 * Book Name: Book D, Book Price: 449.9
 * The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...
class Book {
    private String name;
    private double price;

    public Book(double price, String name) {
        this.name = name;
        this.price = price;
    }

    public Book(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private double price;

        Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;

        }

        public Book build() {
            return new Book(this.price, this.name);
        }

    }
}

// Implement Writer Class
// Code here ...
class Writer {
    private String name;
    private List<Book> books;

    public Writer(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return this.name;
    }

    public List<Book> getBooks() {
        return this.books;
    }
}

// Implement a Comparator to compare the book price
// Code here ...
class SortbyPrice implements Comparator<Book> {
    @Override
    public int compare(Book A, Book B) {
        return B.getPrice() > A.getPrice() ? -1 : 1;
    }

}

class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = new ArrayList<>(List.of(new Book(34.9, "Book A"), new Book(78.9, "Book B")));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = new ArrayList<>(List.of(new Book(104.9, "Book C"), new Book(449.9, "Book D")));
        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = new ArrayList<>(List.of(w1, w2));
        // Print all Writers names
        // Code here ...
        for (Writer w : writers) {
            System.out.println(w.getName());
        }

        // Use flatMap method to return all books written by our writers, storing in a
        // List<Book>
        // Just return the Books!
        // Code here ...
        List<Book> book = writers.stream() //
        .flatMap(e -> e.getBooks().stream()) 
        .collect(Collectors.toList());


        // Print out all books' Name and Price.
        // Code here
        book.stream().forEach(e -> System.out.println("Book Name: " + e.getName() + ", Book Price: " + e.getPrice()));

        // Create Comparator for stream max() method use, aims to find the most
        // expensive book
        // Book maxPriceBook = ...
        Book maxPriceBook = book.stream()
        .max(new SortbyPrice())
        .orElse(new Book(0.0d, " "));
        
        

        // Print out the most expensive book
        System.out.println("The Most Expensive Book: Name=" + maxPriceBook.getName() + ", Price:" + maxPriceBook.getPrice());
    }
}
