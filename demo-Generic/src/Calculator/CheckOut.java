package Calculator;

import java.util.List;

public class CheckOut {

  // call formula()
  // force the method caller to pass an object implenting Adjustment interface
public static <T extends Adjustment> double calulate(List<T> items, double adjustment) {
  double total = 0.0d;
  for (T item: items) {
    total += item.adjust(adjustment); // because T is the bounded by a contract Adjustment.class
  }

}
}
