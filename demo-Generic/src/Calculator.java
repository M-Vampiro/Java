public class Calculator {
  public static <U extends Number> Double calculate(U u1, U u2) {
    double result = 0;
    if (u1 instanceof Byte) {
      result += (Byte) u1;
    } else if (u1 instanceof Short) {
      result += (Short) u1;
    } else if (u1 instanceof Integer) {
      result += (Integer) u1;
    } else if (u1 instanceof Long) {
      result += (Long) u1;
    } else if (u1 instanceof Float) {
      result += (Float) u1;
    } else if (u1 instanceof Double) {
      result += (Double) u1;
    }
      
    if (u1 instanceof Byte) {
      result += (Byte) u2;
    } else if (u1 instanceof Short) {
      result += (Short) u2;
    } else if (u1 instanceof Integer) {
      result += (Integer) u2;
    } else if (u1 instanceof Long) {
      result += (Long) u2;
    } else if (u1 instanceof Float) {
      result += (Float) u2;
    } else if (u1 instanceof Double) {
      result += (Double) u2;
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(calculate(80.0, 90.7));
  }




}
