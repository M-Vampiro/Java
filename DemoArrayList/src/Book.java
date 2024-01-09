import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof Book)) {
      return false;
    }
    Book book = (Book) obj;
    return Objects.equals(this.name, book.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Book("
        + "name = " + this.name
        + ")";
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    Book A = new Book("A");
    Book B = new Book("B");
    Book C = new Book("C");
    books.addAll(List.of(A, B, C));

    // contains
    // System.out.println(books.contains(new Book("A"))); // false, before overriding the equals() method
    System.out.println(books.contains(new Book("A"))); // true, after overriding the equals() method
    System.out.println(books.contains(A));

    boolean found = false;
    for (Book b : books) {
      if (b.name.equals("A")) {
        found = true;
      }
    }
    System.out.println(found);

    System.out.println(books);

  }

}
