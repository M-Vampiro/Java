package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Ball {
  private Color color;
  private double price;

  public Ball(Color color, double price) {
    this.color = color;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public Color getColor() {
    return this.color;
  }
  @Override
  public String toString() {
    return "Color: " + this.color.getName() + 
    ", Price: " + this.price;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color.getName() + this.price);

  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>(
        List.of(new Ball(Color.Red, 20), new Ball(Color.Blue, 30), new Ball(Color.Green, 10)));

    // Approach 1
    Collections.sort(balls, new SortByColor());
    System.out.println(balls);
    Collections.sort(balls, new SortByPrice());
    System.out.println(balls);

    // Approach 2

    Comparator<Ball> sortByColor = (b1, b2) -> {
      return b2.getColor().getName().compareTo(b1.getColor().getName());
    };

    Comparator<Ball> sortByPrice = (b1, b2) -> {
      return b2.getPrice() > b2.getPrice() ? 1 : -1;
    };

    Comparator<Ball> sortByColorthenPrice = sortByColor.thenComparing(sortByPrice);

    List<Ball> balls2 = new ArrayList<>(
        List.of(new Ball(Color.Red, 20), new Ball(Color.Blue, 30), new Ball(Color.Green, 10)));

    Collections.sort(balls2, sortByColorthenPrice);
    System.out.println(balls2);
    

  }

}
