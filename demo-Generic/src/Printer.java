import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is part of class definition, and it can be bounded

  private List<T> values;

  public Printer() {
    this.values = new ArrayList<>();
  }

  public Printer(T values) {
    this.values = new ArrayList<>(List.of(values));
  }

  public void add(T value) {
    values.add(value);
  }

  public List<T> getValue() {
    return this.values;
  }

  public double sum() {
    double sum = 0;
    for (T t : this.values) {
      sum += (double) t;
    }
    return sum;
  }

  public static void main(String[] args) {
    Printer<Integer> in = new Printer<>(100);
    System.out.println(in.getValue());

    // Printer<String> str = new Printer<>("Hello");
    // System.out.println(str.getValue());

    Printer<Double> doublePrinter = new Printer<Double>(10.3);
    doublePrinter.add(5.5);


  }
}
