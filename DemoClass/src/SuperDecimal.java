import java.math.BigDecimal;

// Big Decimal has no "final" keyword , so SuperDecimal can inhertate it
public final class SuperDecimal extends BigDecimal {

  public SuperDecimal() {
    super("0.0");
  }
  
  public SuperDecimal(double value) {
    super(String.valueOf(value)); // New BigDecimal("3.0")
  }

  public static SuperDecimal valueOf(double value) {
    return SuperDecimal.valueOf(value);
  }
  // public BigDecimal multiply(BigDecimal multiplicand) {}

  public SuperDecimal multiply(BigDecimal value) {
    BigDecimal bd = this; // upcast
    BigDecimal bdValue = value; // upcast
    return new SuperDecimal(bd.multiply(bdValue).doubleValue());
  }

  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal();
    // 3.0 * 4.0
    SuperDecimal sd2 = new SuperDecimal(3.0);
    SuperDecimal sd3 = new SuperDecimal(4.0);

    // 3.0 * 4.0 (sd2 * sd3)
    // sd2, sd3 inherit all BigDecimal public instance method
    SuperDecimal sd4 = sd2.multiply(sd3);
    System.out.println(sd4.doubleValue());

  }


  
}
