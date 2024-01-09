package Weapons;

public class Armory {
  public Catagory catagory;

  public String name;

  public Ammo ammoType;

  public int magSize;

  public double radius;

  public double attackRps;

  public boolean extendedMag;

  public int durabillity;

  public int ammoInMag;

  public int ammoBackup;

  // Super Constructor
  public Armory() {

  }

  public void setCatagory(Catagory catagory) {
    this.catagory = catagory;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setammoType(Ammo ammo) {
    this.ammoType = ammo;
  }

  public void setmagSize(int magSize) {
    this.magSize = magSize;
    this.ammoInMag = this.magSize;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setattackRps(double attackRps) {
    this.attackRps = attackRps;
  }

  public String getName() {
    return this.name;
  }

  public Catagory getCatagory() {
    return this.catagory;
  }

  public String getammoType() {
    return this.ammoType.getAmmo();
  }

  public int getmagSize() {
    return this.magSize;
  }

  public double getRadius() {
    return this.radius;
  }

  public double getattackRps() {
    return this.attackRps;
  }

  public boolean getExtendMag() {
    return this.extendedMag;
  }

  public int getammoBackup() {
    return this.ammoBackup;
  }

  public String getDetails() {
    if (this instanceof Firearms) {
      return "Weapon catagory: " + this.catagory + ". Name: " + this.name + ". Ammo: "
          + this.ammoType.getAmmo() + ". Mag Size: " + this.magSize + ". Durabillity: " + this.durabillity + ".";
    } else
      return "Weapon catagory: " + this.catagory + ". Name: " + this.name + "Range: " + this.radius + "Attack Rate: "
          + this.attackRps + ". Durabillity: " + this.durabillity + ".";
  }

  public String getStatus() {
    if (this instanceof Firearms) {
      return "Weapon: " + this.name + ". Ammo in magazine: " + this.ammoInMag + ". Ammo backup : " + this.ammoBackup
          + ". Durabillity: " + this.durabillity + ".";
    } else
      return "";
  }

}
