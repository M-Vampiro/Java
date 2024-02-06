public class Order {

  private int id = 0;

  private Status status;

  public Order(Status status) {
    this.id = id++;
    this.status = status;
  }

  public Status getStatus() {
    return this.status;
  }




  public static void main(String[] args) {

    Order o1 = new Order(Status.ORDERED);
    Order o2 = new Order(Status.SHIPPED);
    Order o3 = new Order(Status.COMPLETED);

    System.out.println(o1.getStatus() == o2.getStatus());

    System.out.println(o1.getStatus().getVal());
  }
}
