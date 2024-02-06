import java.io.IOException;
import java.util.Scanner;


public class DemoMultipleMethod {

  // Difference of throwing checked or unchecked exception
  // 1. For checked exception, you have to handle it by try-catch at the end
  // 2. For unchecked exception, you can either program fix to "avoid" or agree to
  // "accept" the risk.
  // 3. For checked / unchecked, there is still polymorphism between parent and
  // child exception
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    // Call Method A

    // Call a method chain, with checked exception handling
    try {

      System.out.println("Start try");

      System.out.println(methodA(x, y));

      System.out.println("End try");

    } catch (Exception e) {
      if (e instanceof IOException) {
        System.out.println("e is IOException"); // print
      }
    } finally {
      System.out.println("Finally here");
    } 
    System.out.println("End main");
  }

  public static int methodA(int x, int y) {
    // Call Method B
    return methodB(x, y);
  }

  public static int methodB(int x, int y) {
    // Call Method C
    // return Method C(x, y); // unchecked exception example
    return methodC(x, y); // checked exception example
  }

  public static int methodC(int x, int y) throws RuntimeException {
    // What is the difference of throwing checked or unchecked exception in MethodC?
    if (x + y > 10)
      return x + y;
    throw new IllegalArgumentException();
  }

}
