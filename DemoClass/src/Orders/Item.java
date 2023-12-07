package Orders;

import java.math.BigDecimal;

public class Item {

  private double price;
  private int quantity;
  private String desc;
  private double totalAmount;

  // All-Arg Constructor
  public Item(double price, int quantity, String desc) {
    this.price = price;
    this.quantity = quantity;
    this.desc = desc;
  }

  // Setter
  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuan(int quantity) {
    this.quantity = quantity;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  // Getter
  public double getPrice() {
    return this.price;
  }

  public int getQuan() {
    return this.quantity;
  }

  public String getDesc() {
    return this.desc;
  }

  public double totalAmount() {
    
    return (BigDecimal.valueOf(getPrice()).multiply((BigDecimal.valueOf(getQuan())))).doubleValue();
  }

  @Override
  public String toString() {
    return " Item name = " + this.desc
        + " Item price = " + this.price
        + " Item quantity = " + this.quantity
        + " Total amount = " + this.totalAmount;
  }
}
