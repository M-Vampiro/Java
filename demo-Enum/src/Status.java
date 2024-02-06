public enum Status {
  
  ORDERED('O'), //
  SHIPPED('S'), //
  COMPLETED('C'), //
  ;

  // Status enum



  private char val;

  private Status(char val) { // Status('O') -> Status.ORDERED('O')
    this.val = val;
  }

  public char getVal() {
    return this.val;
  }



}
