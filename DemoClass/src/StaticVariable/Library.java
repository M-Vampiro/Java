package StaticVariable;

import java.util.Arrays;

public class Library {

  private static int bookCounter = 0;

  private static Librarian Librarian;

  private Book[] books;

  public Library(Librarian Librarian) {
    this.books = new Book[0];
    Library.Librarian = Librarian;
  }
  public void setLibrarian(Librarian Librarian) {
    Library.Librarian = Librarian;

  }
  public void addbook(Book book) {
    bookCounter++;
    Book[] newBooklist = Arrays.copyOf(this.books, this.books.length + 1);
    newBooklist[newBooklist.length - 1] = book;
  }

  public int getBookCount() { // Instance method can access static methods
    return bookCounter;
  }

  public static void main(String[] args) {
    Librarian librarian = new Librarian("Emma");
    Librarian librarian2 = new Librarian("John");
    Library library = new Library(librarian);
    Library library2 = new Library(librarian2);
    System.out.println(librarian.LibrariangetName());
    System.out.println(librarian2.LibrariangetName());
    Librarian librarian3 = new Librarian("Ivy");
    library2.setLibrarian(librarian3);

    
  }
}