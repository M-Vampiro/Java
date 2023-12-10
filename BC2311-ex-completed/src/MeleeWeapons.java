public class MeleeWeapons extends Armory {
  // Attributes

  // Empty Constructor
  public MeleeWeapons() {
  }

  // Augment Constructor
  public MeleeWeapons(String name, double radius, double attackRps) {
    this.name = name;
    this.radius = radius;
    this.attackRps = attackRps;
  }

  // Setter

  // Getter

  // Main
  public static void main(String[] args) {
    MeleeWeapons m1 = new MeleeWeapons();
    m1.setName("Dagger");
    m1.setRadius(8);
    m1.setattackRps(4.0);
    System.out.println(m1.getName());
    System.out.println(m1.getRadius());
    System.out.println(m1.getattackRps());
    MeleeWeapons m2 = new MeleeWeapons();
    m2.setName("Crowbar");
    m2.setRadius(18);
    m2.setattackRps(2.5);
    System.out.println(m2.getName());
    System.out.println(m2.getRadius());
    System.out.println(m2.getattackRps());
    MeleeWeapons m3 = new MeleeWeapons("Wrench", 12, 1.5);
    System.out.println(m3.getName());
    System.out.println(m3.getRadius());
    System.out.println(m3.getattackRps());
    MeleeWeapons m4 = new MeleeWeapons();
    m4.setName("Disarmmed");
    System.out.println(m4.getName());
  }

}
