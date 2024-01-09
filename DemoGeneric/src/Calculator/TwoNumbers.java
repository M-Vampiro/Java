package Calculator;

import java.util.List;

public class TwoNumbers implements Calculator {

  @Override
  public double formula(double x, double y) {


  }

  // call formula()
  // force the method caller to pass an object implenting Adjustment interface
  public static <T> double calculate(List<T> items, double adjustment) {
    double total = 0.0d;
    for (T item: items) {
      total += item.adjust(adjustment);
    }

  }
}
