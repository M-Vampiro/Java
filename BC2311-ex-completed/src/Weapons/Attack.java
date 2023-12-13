package Weapons;

public interface Attack {

  void attack(int times);

  boolean isDamaged();

  int durabillity();

  boolean restore();

  default void rapidFire() {
  }

}
