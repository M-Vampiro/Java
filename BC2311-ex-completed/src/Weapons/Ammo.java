package Weapons;

public enum Ammo {
   P9("9mm"),
   P45(".45 ACP"),
   R762("5.56mm"),
   R556("7.62mm"),;




   private String ammo;

   private Ammo(String ammo) {
    this.ammo = ammo;
   }

   public String getAmmo() {
    return this.ammo;
   }
   



}
