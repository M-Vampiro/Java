package Poker;
public enum Rank {

  RA("A"),
  R2("2"),
  R3("3"),
  R4("4"),
  R5("5"),
  R6("6"),
  R7("7"),
  R8("8"),
  R9("9"),
  R10("10"),
  RJ("J"),
  RQ("Q"),
  RK("K");
  

  private String rank;
  
  private Rank(String rank) {
    this.rank = rank;
  }

  public String getRank() {
    return this.rank;
  }
  
}
