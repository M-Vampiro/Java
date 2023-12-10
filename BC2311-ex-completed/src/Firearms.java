public class Firearms extends Armory {
  // Attributes

  // Empty constructor
  public Firearms() {
  }
  // Argument constructor
  public Firearms(String catagory, String name, String ammo, int magSize, double attackRps, boolean extendedMag) {
    this.catagory = catagory;
    this.name = name;
    this.ammoType = ammo;
    this.magSize = magSize;
    this.attackRps = attackRps;
    this.extendedMag = extendedMag;
  }
  // Setter

  // Getter

  // main

  public static void main(String[] args) {
    Firearms f1 = new Firearms();
    f1.setCatagory("SMG");
    f1.setName("MP5");
    f1.setammoType("9mm");
    f1.setmagSize(30);
    System.out.println(f1.getCatagory());
    System.out.println(f1.getName());
    System.out.println(f1.getammoType());
    System.out.println(f1.getmagSize());
    Firearms f2 = new Firearms();
    f2.setCatagory("Pistol");
    f2.setName("Glock 18");
    f2.setammoType("9mm");
    f2.setExtendedMag(true);
    f2.setmagSize(17);
    System.out.println(f2.getCatagory());
    System.out.println(f2.getName());
    System.out.println(f2.getammoType());
    System.out.println(f2.getmagSize());
    System.out.println(f2.getExtendMag());
    Firearms f3 = new Firearms("Rifle", "M4A1", "5.56mm", 30, 5.0 ,false);
    System.out.println(f3.getCatagory());
    System.out.println(f3.getName());
    System.out.println(f3.getammoType());
    System.out.println(f3.getmagSize());
    Firearms f4 = new Firearms("Rifle", "AK47", "7.62mm", 30, 3.5, false);
    System.out.println(f4.getCatagory());
    System.out.println(f4.getName());
    System.out.println(f4.getammoType());
    System.out.println(f4.getmagSize());
  }
}