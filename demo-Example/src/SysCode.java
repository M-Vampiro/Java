public enum SysCode {


  // 1 - 1000 (reserved for error)
  SERVER_TIMEOUT(1, "Server connection time out."),

  // 1001 - 2000 (reserved for warning)
  DB_TIMEOUT(1001, "DataBase connection time out."),;


  private String message;

  private int code;

  private SysCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode() {
    return this.code;
  }


  
}
