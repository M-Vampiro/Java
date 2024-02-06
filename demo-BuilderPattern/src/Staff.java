public class Staff {

  private String name;
  private int yearOfEXP;

  public Staff() {

  }

  public static Staff builder() {
    return new Staff();

  }
  
  private Staff(String name, int yearOfEXP) {
    this.name = name;
    this.yearOfEXP = yearOfEXP;
  }

  public Staff name(String name) {
    this.name = name;
    return this;
  }

  public Staff yearOfEXP(int yearOfEXP) {
    this.yearOfEXP = yearOfEXP;
    return this;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearOfEXP(int yearOfEXP) {
    this.yearOfEXP = yearOfEXP;
  }

  public static void main(String[] args) {
    Staff staff1 = builder().setName("Amy").setYearOfEXP(5);

  }


  
}
