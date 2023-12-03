public class Firearms {
  // Attributes
  private String ammoType;

  private String name;

  private int magSize;

  // Empty constructor
  public Firearms() {
  }

  // Argument constructor
  public Firearms(String x, String y, int z) {
    this.ammoType = x;
    this.name = y;
    this.magSize = z;
  }

  // Setter
  public void setName(String y) {
    this.name = y;
  }

  public void setammoType(String x) {
    this.ammoType = x;
  }

  public void setmagSize(int z) {
    this.magSize = z;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public String getammoType() {
    return this.ammoType;
  }

  public int getmagSize() {
    return this.magSize;
  }
  // main

  public static void main(String[] args) {
    Firearms f1 = new Firearms();
    f1.setName("MP5");
    f1.setammoType("9mm");
    f1.setmagSize(30);
    System.out.println(f1.getName());
    System.out.println(f1.getammoType());
    System.out.println(f1.getmagSize());
    Firearms f2 = new Firearms();
    f2.setName("Glock 18");
    f2.setammoType("9mm");
    f2.setmagSize(17);
    boolean ExtendedMag = false;
    if (ExtendedMag) {
      f2.setmagSize(33);
    }
    System.out.println(f2.getName());
    System.out.println(f2.getammoType());
    System.out.println(f2.getmagSize());
    Firearms f3 = new Firearms("5.56", "M4A1", 30);
    System.out.println(f3.getName());
    System.out.println(f3.getammoType());
    System.out.println(f3.getmagSize());
    Firearms f4 = new Firearms("7.62 by 39", "AK", 25);
    System.out.println(f4.getName());
    System.out.println(f4.getammoType());
    System.out.println(f4.getmagSize());
  }
}