package Weapons;

public class Firearms extends Armory implements Attack, Ammo {
  // Attributes

  // Empty constructor
  public Firearms() {
    this.extendedMag = false;
    this.durabillity = 100;
    this.ammoBackup = 0;
  }

  // Argument constructor
  public Firearms(String catagory, String name, String ammo, int magSize, double attackRps) {
    this.catagory = catagory;
    this.name = name;
    this.ammoType = ammo;
    this.magSize = magSize;
    this.attackRps = attackRps;
    this.extendedMag = false;
    this.durabillity = 100;
    this.ammoInMag = this.magSize;
    this.ammoBackup = 0;
  }
  // Setter

  // Getter

  // main
  @Override
  public int durabillity() {
    return this.durabillity;
  }

  @Override
  public boolean isDamaged() {
    if (durabillity() == 0) {
      return true;
    }
    return false;
  }

  @Override
  public boolean restore() {
    if (this.durabillity != 100) {
      this.durabillity = 100;
      return true;
    }
    return false;
  }

  @Override
  public boolean isExtendMag() {
    if (this.extendedMag) {
      return true;
    }
    return false;
  }

  @Override
  public void useExtendedMag() {
    if (!isExtendMag() && this.catagory == "Pistol") {
      this.magSize = magSize + 16;
    } else if (!isExtendMag() && this.catagory == "Rifle") {
      this.magSize = magSize + 10;
    }

  }

  @Override
  public boolean magisEmpty() {
    if (this.ammoInMag != 0) {
      return false;
    }
    return true;
  }

  @Override
  public boolean buyAmmo() {
    if (this.ammoBackup == this.magSize * 3) {
      return false;
    }
    if (this.ammoBackup < this.magSize * 3 && this.ammoBackup > this.magSize * 2) {
      this.ammoBackup = this.magSize * 3;
      return true;
    }
    this.ammoBackup += this.magSize;
    return true;
  }

  public boolean reload() {
    if (this.ammoInMag < this.magSize && this.ammoBackup >= magSize) {
      this.ammoBackup -= (this.magSize - this.ammoInMag);
      this.ammoInMag = this.magSize;
      return true;
    } else if (this.ammoInMag < this.magSize && this.ammoBackup < magSize) {
      this.ammoInMag += this.ammoBackup;
      this.ammoBackup = 0;
    }
    return false;
  }

  @Override
  public void attack(int rounds) {
    while (!isDamaged() && !magisEmpty() && rounds > 0) {
      this.ammoInMag -= 1;
      this.durabillity -= 1;
      rounds--;
    }
  }

  @Override
  public void rapidFire() {
    attack(3);

  }

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
    f2.setmagSize(17);
    f2.useExtendedMag();
    System.out.println(f2.getCatagory());
    System.out.println(f2.getName());
    System.out.println(f2.getammoType());
    System.out.println(f2.getmagSize());
    System.out.println(f2.getExtendMag());
    Firearms f3 = new Firearms("Rifle", "M4A1", "5.56mm", 30, 5.0);
    System.out.println(f3.getCatagory());
    System.out.println(f3.getName());
    System.out.println(f3.getammoType());
    System.out.println(f3.getmagSize());
    Firearms f4 = new Firearms("Rifle", "AK47", "7.62mm", 30, 3.5);
    System.out.println(f4.getCatagory());
    System.out.println(f4.getName());
    System.out.println(f4.getammoType());
    System.out.println(f4.getmagSize());

    System.out.println(f1.getDetails());
    System.out.println(f2.getDetails());
    System.out.println(f3.getDetails());
    System.out.println(f4.getDetails());

    f1.rapidFire(); // test if rapidFire works
    System.out.println(f1.getStatus());
    System.out.println("Reload: " + f1.reload());
    f1.reload();  // test if reload works
    System.out.println(f1.getStatus());
    f1.buyAmmo(); // test if buyAmmo works
    System.out.println("Reload: " + f1.reload());
    f1.reload();
    System.out.println(f1.getStatus());
    f1.attack(28); // test if attack works
    System.out.println(f1.getStatus());
    System.out.println("Reload: " + f1.reload());
    f1.reload(); // test if reload have bugs
    System.out.println(f1.getStatus());
    f1.buyAmmo();
    f1.buyAmmo();
    f1.buyAmmo();
    f1.buyAmmo(); // test if buyAmmo have bugs
    f1.attack(31); // test if attack have bugs
    System.out.println(f1.getStatus());
    f1.reload();
    f1.attack(30);
    f1.reload();
    f1.attack(30); // check if Durabillity works
    System.out.println(f1.getStatus());

  }
}