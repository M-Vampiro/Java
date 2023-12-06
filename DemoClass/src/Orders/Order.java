package Orders;
import java.time.LocalDate;

public class Order {
  private int id;
  private LocalDate buyDate;
  private double totalAmount;

public Order() {
}
  
public Order(int x, LocalDate y, double z) {
  this.id = x;
  this.buyDate = y;
  this.totalAmount = z;
}

public void setid(int x) {
  this.id = x;
}
public void setbuyDate(LocalDate y) {
  this.buyDate = y ;
}
public void settotalAmount(double z) {
  this.totalAmount = z;
}
public int getid() {
  return this.id;
}
public LocalDate getbuyDate() {
  return this.buyDate;
}
public double gettotalAmount() {
  return this.totalAmount;
}
@Override
  public String toString() {
    return " Order id = " + this.id
   + " Order date = " + this.buyDate
   + " Total Amount = " + this.totalAmount;
}

}