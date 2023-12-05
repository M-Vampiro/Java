import java.text.DecimalFormat;

public class Circle {
  private static final DecimalFormat df = new DecimalFormat("0.00");
  private double radius;

// Empty Construtor
  public Circle () {
  }
// Argument Constructor
  public Circle (double radius) {
    this.radius = radius;
  }
// Getter
  public double getRadius()  {
  return this.radius;
  }
// Instance Method
  public double diameter() {
    return this.radius * 2;
  }
  public double area() {
    // return this.radius * this.radius * 3.14
    // Math library
    return Math.pow(this.radius, 2) * Math.PI;
  }
// Setter
  public void setRadius(double radius) {
    this.radius = radius;
  }
// main - new a circle

public static void main (String[] args) {
  Circle circle = new Circle(); // radius = 0.0
  circle.setRadius(3.2d);
  System.out.println(circle.getRadius());

  Circle circle2 = new Circle(3.4d);
  System.out.println(circle2.getRadius());
  circle2 = circle;

  double diameter1 = circle.diameter();
  double area1 = circle.area();
  System.out.println("Circle 1 diameter = " + diameter1);
  System.out.println("Circle 1 area = " + df.format(area1));
  double diameter2 = circle2.diameter();
  double area2 = circle2.area();
  System.out.println("Circle 2 diameter = " + diameter2);
  System.out.println("Circle 2 area = " + df.format(area2));
}




}
