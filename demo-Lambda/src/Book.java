public class Book {
  private double price;
  private String name;

  public Book() {

  }

  public Book(double price) {
    this.price = price;
  }
  public Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
