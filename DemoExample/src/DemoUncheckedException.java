public class DemoUncheckedException {
  private double balance;
  public static void main(String[] args) {
    
    // Unchecked Exception (Run - Time exception)
    // 1. It is not required to handle 

    // Example 1: double/double -> 10.0 / 0.0 -> NaN
    /* double result;
    try {
      System.out.println("Before");
      result = divide(10.5d, 0.0d);
      if (Double.isInfinite(result)) {
        System.out.println("result is Infinite");
      }
      System.out.println("After");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      result = 0.0d;
    } */

     // Example 2: int / int -> 10 / 0 -> ArithmeticException
    int result2;
    try {
      System.out.println("Before");
      result2 = divide(10, 0);
      
      System.out.println("After");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      result2 = 0;
    }
    result2 = divide(10, 0);

    System.out.println("result = " + result2);

  }

  public static double divide(double x, double y) {
    return x / y; // 0.0 / 0.0 -> Infinite
  }

  public static int divide(int x, int y) {
    return x / y; // Potentially run-time exception - ArithmeticException
  }

  public boolean deposit(double amount) {
    if (amount <= 0.0d) 
    throw new IllegalArgumentException();
    this.balance += amount;
    return true;
  }

}
