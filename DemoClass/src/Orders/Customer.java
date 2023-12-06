package Orders;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wrapper Classes, Primitives)
  private Order[] orders;

  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(Order orders) {
    this.orders = new Order[] { orders };
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  // Setter
  public void addorder(Order orders) {
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[this.orders.length - 1] = orders;
    this.orders = newOrders;
  }

  public void setorderList(Order orders) {
    this.orders = new Order[] { orders };
  }

  // Getter
  public String getorderList() {
    return this.orders.toString();
  }

  public String getorder() {
    return this.orders.toString();
  }
  public boolean updateOrderAmount(int orderid, double totalAmount) {
    for (int i = 0 ; i < orders.length ; i++ ) {
      if (orders[i].getid() == orderid) {
        orders[i].settotalAmount(totalAmount);
        return true;
      }
    }
      return false;
    
  }

  @Override
  public String toString() {
    return "This customer has orders : " + Arrays.toString(this.orders);
  }

  public static void main(String[] args) {
    // New a customer obj.
    Order o1 = new Order(1, LocalDate.of(2023, 10, 26), 2500.0d);
    Order[] o2 = new Order[] { new Order(2, LocalDate.of(2023, 10, 24), 200.0d),
        new Order(3, LocalDate.of(2023, 10, 24), 500.0d) };
    Customer c1 = new Customer(o1);
    Customer c2 = new Customer(o2);
    System.out.println(o1.toString());
    System.out.println(c1.toString());
    System.out.println(o2.toString());
    System.out.println(c2.toString());

    // New some order objects, and put into the customer object
      Order o3 = new Order(4 , LocalDate.of(2023, 10 ,25), 300.0d);
      o1.addorder(new Order(4 , LocalDate.of(2023, 10 ,25), 300.0d));

    // research -> Class of class
  }
}
