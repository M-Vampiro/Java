import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoOperator {
  public static void main(String[] args) {
    BinaryOperator<String> concatStrings = (s1, s2) -> s1.concat(s2);
    BiFunction<String, String, String> concatStrings2 = (s1, s2) -> s1.concat(s2);

    UnaryOperator<Integer> doubleNum = n -> n*2;
    Function<Integer, Integer> doubleNum2 = n -> n*2;

    System.out.println(doubleNum.apply(90));

    UnaryOperator<String> removeSpace = s -> s.replace(" ", "");
    System.out.println(removeSpace.apply("h e llo")); // hello
  }
}
