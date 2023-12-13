package Weapons;

public class Armory {
  public String catagory;

  public String name;

  public String ammoType;

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

  public void setCatagory(String catagory) {
    this.catagory = catagory;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setammoType(String ammo) {
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

  public String getCatagory() {
    return this.catagory;
  }

  public String getammoType() {
    return this.ammoType;
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
    return "Weapon catagory: " + this.catagory + ". Name: " + this.name + ". Ammo: "
        + this.ammoType + ". Mag Size: " + this.magSize + ". Durabillity: " + this.durabillity + ".";
  }

  public String getStatus() {
    return "Weapon: " + this.name + ". Ammo in magazine: " + this.ammoInMag + ". Ammo backup : " + this.ammoBackup
        + ". Durabillity: " + this.durabillity + ".";
  }

}
