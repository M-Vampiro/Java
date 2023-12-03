public class MeleeWeapons {
  // Attributes
  private String name;

  private int radius;

  private double rateperSecond;

  // Empty Constructor
  public MeleeWeapons() {
  }

  // Augment Constructor
  public MeleeWeapons(String x, int y, double z) {
    this.name = x;
    this.radius = y;
    this.rateperSecond = z;
  }

  // Setter
  public void setName(String x) {
    this.name = x;
  }

  public void setRadius(int y) {
    this.radius = y;
  }

  public void setRate(double z) {
    this.rateperSecond = z;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public int getRadius() {
    return this.radius;
  }

  public double getRate() {
    return this.rateperSecond;
  }

  // Main
  public static void main(String[] args) {
    MeleeWeapons m1 = new MeleeWeapons();
    m1.setName("Dagger");
    m1.setRadius(12);
    m1.setRate(4.0);
    System.out.println(m1.getName());
    System.out.println(m1.getRadius());
    System.out.println(m1.getRate());
    MeleeWeapons m2 = new MeleeWeapons();
    m2.setName("Crowbar");
    m2.setRadius(18);
    m2.setRate(2.5);
    System.out.println(m2.getName());
    System.out.println(m2.getRadius());
    System.out.println(m2.getRate());
    MeleeWeapons m3 = new MeleeWeapons("Wrench", 24, 1.5);
    System.out.println(m3.getName());
    System.out.println(m3.getRadius());
    System.out.println(m3.getRate());
    MeleeWeapons m4 = new MeleeWeapons("Disarmmed", -1 , 0.0);
    System.out.println(m4.getName());
    System.out.println(m4.getRadius());
    System.out.println(m4.getRate());
  }

}
