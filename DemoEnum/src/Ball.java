public class Ball {

  // private String colors //
  private Color color; // relatively finite numbers

  public Ball(Color color) {
    this.color = color;

  }

  public Color getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    // Before the main{} starts, class load -> new Color("Red"), new
    // Color("Yellow"), new Color ("Black")
    // Color.RED (Something like public static final, But Color.Red is an Object()
    // You cannot "new" the Color object by yourself

    Ball b1 = new Ball(Color.Red);
    System.out.println(b1.getColor());
    Ball b2 = new Ball(Color.Blue);
    System.out.println(b2.getColor());
    Ball b3 = new Ball(Color.Green);
    System.out.println(b3.getColor());
    Ball b4 = new Ball(Color.Yellow);
    System.out.println(b4.getColor());
    Ball b5 = new Ball(Color.Red);
    System.out.println(b5.getColor());


    if (b5.getColor() == b1.getColor()) {
      System.out.println("Same color");
    }



  }

}