import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {

  private int num = 100;
  private String name = "name";

  public static void main(String[] args) {
    // f(x) = x + 3
    // y = x + 3

    Function<String, Integer> stringLength = (str) -> {
      return str.length();
    };

    System.out.println(stringLength.apply("hello"));
    System.out.println(stringLength.apply("abcdefghijklmnopqrstuvwxyz"));

    Function<DemoFunction, Integer> getnum = (obj) -> {
      return obj.num;
    };

    Function<DemoFunction, String> getname = (obj) -> {
      return obj.name;
    };

    System.out.println(getnum.apply(new DemoFunction()));
    System.out.println(getname.apply(new DemoFunction()));

    BiFunction<List<String>, Integer, String> getByIndex = (strings, index) -> {
      return strings.get(index);
    };

    BiFunction<String, String, String> remapFunc = (key, oldValue) -> {
      if (oldValue.length() <= 4)
      return null;
      return oldValue == null ? "hello" : oldValue.concat("end");
    };

    System.out.println(getByIndex.apply(new ArrayList<>(List.of("abc", "bcd")), 1));

    // Example for function
    Map<String, String> dicMap = new HashMap<>();
    dicMap.put("John", "ABC");
    dicMap.put("Mary", "IJK");
    dicMap.compute("Mary", remapFunc);
    System.out.println(dicMap.get("Mary"));
    /* dicMap.compute("Peter", remapFunc);
    System.out.println(dicMap.get("Peter")); */
    System.out.println(dicMap.size());
    System.out.println(dicMap);


  }
}
