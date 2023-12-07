package Orders;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wrapper Classes, Primitives)
  private Order[] orders;
  private int age;
  private boolean VIP;

  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(int age) {
    this.age = age;
  }

  public Customer(Order orders) {
    this.orders = new Order[] {orders};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  // Setter
  public void addorder(Order orders) {
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[this.orders.length] = orders;
    this.orders = newOrders;
  }
  // public void additems(Order orders, Item[] items) {
  // Item[] newItems = Arrays.copyOf();
  // newOrders[this.orders.length] = orders;
  // this.orders = newOrders;
  // }

  public void setorderList(Order orders) {
    this.orders = new Order[] { orders };
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Getter
  public String getorderList() {
    return this.orders.toString();
  }

  public String upgradeVIP() {
    if (this.orders.length == 100) {
      this.VIP = true;
      return "Congrats You're our VIP!!!";
    } else if (this.orders.length > 100) {
      return "You're already our VIP!!!";
    }
    return "You still need to order " + (100 - this.orders.length) + "to be our VIP!!!";

  }

  public String getorder() {
    return this.orders.toString();
  }

  public Order getorders(int orderId) {
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getid() == orderId) {
        return this.orders[i];
      }
    }
    return null;
  }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public boolean updateItems(int orderid, Item[] items) {
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getid() == orderid) {
        orders[i].setItems(items);
        return true;
      }
    }
    return false;
  }

  public boolean deleteorder(int orderid) {

    Order[] newArr = new Order[this.orders.length - 1];
    boolean found = false;
    int count = 0;
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getid() != orderid) {
        if (count == i) {
          break;
        }
        newArr[count++] = this.orders[i];
      } else {

        found = true;
      }
    }
    return found;
  }

  @Override
  public String toString() {
    return "This customer has orders : " + Arrays.toString(this.orders);
  }

  public static void main(String[] args) {
    // New a customer obj.
    Item[] i1 = new Item[] {new Item(15.5, 10, "smthg")};
    Order[] o1 = new Order[] {
        new Order(LocalDate.of(2023, 10, 24), i1)};
    Customer c1 = new Customer(o1);
    System.out.println(Arrays.toString(i1));
    System.out.println(Arrays.toString(o1));
    System.out.println(c1.toString());

    // New some order objects, and put into the customer object

    // research -> Class of class
  }
}
