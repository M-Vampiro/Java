package Orders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {
  private int id;
  private LocalDate buyDate;
  private Item[] items;
  private static int orderNum;

  public Order() {
  }

  public Order(LocalDate y, Item[] items) {
    this.id = ++orderNum;
    this.buyDate = y;
    this.items = new Item[0];
    
  }

  public void setbuyDate(LocalDate y) {
    this.buyDate = y;
  }
  public void setItems(Item[] items) {
    this.items = items;
  }

  public Item[] getItems() {
    return this.items;
  }

  public int getid() {
    return this.id;
  }

  public LocalDate getbuyDate() {
    return this.buyDate;
  }

  public double gettotalAmount() {
    BigDecimal totalAmount = new BigDecimal(0);
    for ( int i = 0 ; i < this.items.length - 1 ; i++) {
      totalAmount = totalAmount.add(BigDecimal.valueOf(this.items[i].getPrice()).multiply((BigDecimal.valueOf(this.items[i].getQuan()
      ))));
    }
    return totalAmount.doubleValue();
  }

  public static double gettotalAmount(Item[] items) {
    BigDecimal totalAmount = new BigDecimal(0);
    for ( int i = 0 ; i < items.length - 1 ; i++) {
      totalAmount = totalAmount.add(BigDecimal.valueOf(items[i].getPrice()).multiply((BigDecimal.valueOf(items[i].getQuan()
      ))));
    }
    return totalAmount.doubleValue();
  }
  

  @Override
  public String toString() {
    return " Order id = " + this.id
        + " Order date = " + this.buyDate
        + Arrays.toString(this.items);
  }

}