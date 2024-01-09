import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {

    int age = 17;
    boolean isAdult = age >= 18;
    System.out.println(isAdult);

    Predicate<Integer> isAdult2 = x -> x >= 18;
    System.out.println(isAdult2.test(17)); // false
    System.out.println(isAdult2.test(18)); // true
    System.out.println(isAdult2.test(19)); // true

    Function<Integer, Boolean> predicateFunction = x -> x >= 10; // same idea with Predicate<Integer>

    Predicate<Integer> isOdd = x -> x % 2 == 1;

    System.out.println(isOdd.test(17));
    if (isOdd.test(18))
      System.out.println("The number is Odd");
    else
      System.out.println("not Odd");

    Predicate<Integer> isOddAndPositive = x -> x % 2 == 1 & x > 0;

    System.out.println(isOddAndPositive.test(-1)); // false

    // Approach 2
    Predicate<Integer> isPossitive = x -> x > 0;
    System.out.println(isOdd.and(isPossitive).test(2)); // false
    System.out.println(isOdd.and(isPossitive).test(-2)); // true
    System.out.println(isOdd.and(isPossitive).test(1)); // false
    System.out.println(isOdd.and(isPossitive).test(-1)); // false

    System.out.println(isOdd.or(isPossitive).test(2)); // true

    // Check if the charAt string is vowel
    BiPredicate<String, Integer> isVowel = (string, index) -> {
      Objects.nonNull(string);
      Objects.nonNull(index);
      if (index > string.length() - 1 || index < 0)
        return false;
      return string.charAt(index) == 'a' || string.charAt(index) == 'e' || string.charAt(index) == 'i'
          || string.charAt(index) == 'o' || string.charAt(index) == 'u' || string.charAt(index) == 'A'
          || string.charAt(index) == 'E' || string.charAt(index) == 'I' || string.charAt(index) == 'O'
          || string.charAt(index) == 'U';
    };

    System.out.println(isVowel.test("hello", 0)); // false
    System.out.println(isVowel.test("hello", 1)); // true
    System.out.println(isVowel.test("hello", 2)); // false
    System.out.println(isVowel.test("hello", 3)); // false
    System.out.println(isVowel.test("hello", 4)); // true

  }
}
