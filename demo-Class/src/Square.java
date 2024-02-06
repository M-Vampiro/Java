public class Square extends Shape {

  private int length;

  public Square(int length) {
    this.length = length;
  }
  @Override
  public double area() {
    return Math.pow( length, 2);
  }
}
