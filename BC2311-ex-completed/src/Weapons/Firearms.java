package Weapons;

import java.util.Objects;

public class Firearms extends Armory implements Attack, AmmoFunc {
  // Attributes
  int MAX_DURABILLITY = 100;

  // Empty constructor
  public Firearms() {
    this.extendedMag = false;
    this.durabillity = MAX_DURABILLITY;
    this.ammoBackup = 0;
  }

  // Argument constructor
  public Firearms(Catagory catagory, String name, Ammo ammo, int magSize, double attackRps) {
    this.catagory = catagory;
    this.name = name;
    this.ammoType = ammo;
    this.magSize = magSize;
    this.attackRps = attackRps;
    this.extendedMag = false;
    this.durabillity = MAX_DURABILLITY;
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
    if (this.durabillity != MAX_DURABILLITY) {
      this.durabillity = MAX_DURABILLITY;
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
    if (!isExtendMag() && this.catagory == Catagory.Pistol) {
      this.magSize = magSize + 16;
    } else if (!isExtendMag() && this.catagory == Catagory.Rifle) {
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
    } else if (this.ammoInMag < this.magSize && this.ammoBackup < magSize && this.ammoBackup != 0) {
      this.ammoInMag += this.ammoBackup;
      this.ammoBackup = 0;
      return true;
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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof Firearms)) {
      return false;
    }
    Firearms firearms = (Firearms) obj;
    return Objects.equals(firearms.getCatagory(), this.catagory)
        && Objects.equals(firearms.getName(), this.name)
        && Objects.equals(firearms.getammoType(), this.ammoType.getAmmo())
        && Objects.equals(firearms.getmagSize(), this.magSize)
        && Objects.equals(firearms.getattackRps(), this.attackRps);
  }

  public int hashCode() {
    return Objects.hash(this.catagory, this.name, this.ammoType, this.magSize, this.attackRps);
  }

  public static void main(String[] args) {
    Firearms f1 = new Firearms();
    f1.setCatagory(Catagory.SMG);
    f1.setName("MP5");
    f1.setammoType(Ammo.P9);
    f1.setmagSize(30);
    Firearms f2 = new Firearms();
    f2.setCatagory(Catagory.Pistol);
    f2.setName("Glock 18");
    f2.setammoType(Ammo.P9);
    f2.setmagSize(17);
    f2.useExtendedMag();
    Firearms f3 = new Firearms(Catagory.Rifle, "M4A1", Ammo.R556, 30, 5.0);
    Firearms f4 = new Firearms(Catagory.Rifle, "AK47", Ammo.R762, 30, 3.5);
    
    System.out.println(f1.getDetails());
    System.out.println(f2.getDetails());
    System.out.println(f3.getDetails());
    System.out.println(f4.getDetails());

    f1.rapidFire(); // test if rapidFire works
    System.out.println(f1.getStatus());
    System.out.println("Reload: " + f1.reload());
    f1.reload(); // test if reload works
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