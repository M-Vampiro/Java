package Box;

import java.util.ArrayList;
import java.util.List;

public class Shape {

  public double area() {
    return -1.0;
  }

  // Static Method: Sum up all area from the class objects (Circle/Shape)
  public static <T extends Shape> double area(List<T> shapes) { // anything wrong?
    // loop
    double result = 0.0;
    for (T t : shapes) {
      result += t.area();
    }
    return result;
  
}

  public static double area2(List<Shape> shapes) { // anything wrong?
    double sum = 0.0d;
    for(Shape shape: shapes ) {
      sum += shape.area();
    }
    return sum;
  }

  public static double area3(List<? extends Shape> shapes) { // anything wrong?
    double sum = 0.0d;
    for (Shape shape : shapes) {
      sum+= shape.area();
    }
    return sum;

  }

  public static void area4(List<? super Shape> shapes, Shape shape) { // anything wrong?
    shapes.add(shape);
  }


  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(10));

    System.out.println(area(circles));
  
    List<Square> squares = new ArrayList<>();
    squares.add(new Square(15));

    System.out.println(area3(squares));

    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Square(10));
    shapes.add(new SmallCircle(5));
    System.out.println(area2(shapes));

    System.out.println(area(shapes));
  }
}
