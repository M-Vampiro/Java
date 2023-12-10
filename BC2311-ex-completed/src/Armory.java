public class Armory {
  public String catagory;

  public String name;

  public String ammoType;

  public int magSize;

  public double radius;

  public double attackRps;

  public boolean extendedMag;

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
    if (extendedMag && this.catagory == "Pistol") {
      this.magSize = magSize + 16;
    } else if (this.catagory == "Rifle") {
    this.magSize = magSize + 10;
    } else this.magSize = magSize;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setattackRps(double attackRps) {
    this.attackRps = attackRps;
  }
  public void setExtendedMag(boolean extendedMag) {
    this.extendedMag = extendedMag;
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
}
