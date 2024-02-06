public class DemoCheckException extends Exception {
  public static void main(String[] args) {
    // Checked exception - compiler requires the exception to be handled during
    // the complie time
    // 1.) if you throw an unchecked exception, you have to handle it.
    // 1a.) Sign the unchecked exception in the method signature
    // isEmailVaild("xxxxxxxxxx@gmail.com"); // The method caller still need to
    // handle the unchecked exception even the
    // method throws already.

    // 1b.) truy-catch to handle
    try {
      isEmailValid("xxxxxxxxx@gmail.com");
    } catch (BusinessException e) {
      // You can do anything after you catched it. Or do nothing.
      System.out.println(e.getMessage());
    }

  }

  public static boolean isEmailValid(String emaileddr) throws BusinessException {
    if (emaileddr == null || emaileddr.length() > 10)
      // return false;
      throw new BusinessException("emailaddr is too long, the length should be <= 100");
    return true;
  }

  public static boolean isEmailValid2(String emaileddr) throws BusinessException {
    if (emaileddr != null && emaileddr.length() == 8)
      return true;
    if (emaileddr == null || emaileddr.length() < 8)
      return false;
    throw new BusinessException("");
  }

}
