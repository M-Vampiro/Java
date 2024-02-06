public class BusinessException extends Exception {

  private int code;

  // Any class extends Exception is Checked Exception
  private BusinessException(int code, String message) { // "Server is unavaliable."
    super(message);
    this.code = code;
  }

  public BusinessException(SysCode sysCode) {
    this(sysCode.getCode(), sysCode.getMessage());
  }

  public static void main(String[] args) {
    try {
      throw new BusinessException(SysCode.SERVER_TIMEOUT);
    } catch (BusinessException e) {

    }

  }
}
