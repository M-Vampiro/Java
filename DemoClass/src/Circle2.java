import java.math.BigDecimal;

public class Circle2 extends Shape {

  private double radius;

  // Circle extends Shape
  // so it has to implement all abstract methods in Parent abstract class
  public Circle2() {
    // super(); // calling Shape()
  }

  public Circle2(double radius) {
    // super(); // calling Shape()
    this.radius = radius;
  }

  public Circle2(double radius, String color) {
    super(color);
    this.radius = radius;
    
  }
  public double getRadius() {
    return this.radius;
  }

  // Circle extends Shape
  // so it has to implement all abstract methods in Parent abstract class
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    // divide() -> 10 / 3 -> 3.333333 -> Rounding
  }



}
