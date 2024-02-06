public class Taxi implements Vehicle {

  private int speed;

  private int capacity;

  private String serviceArea;

  private static final int MAX_SPEED = 100;
  
  public Taxi() {

  }

  private Taxi(int speed, int capacity) {
    this.speed = speed;
  }

public static Taxi small() {
  return new Taxi(0, 4);
}
public static Taxi big() {
  return new Taxi(0, 5);
}


  public void setserviceArea(String area) {
    this.serviceArea = area;
  }

  public int currentSpeed() {
    return this.speed;
  }

  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed == 0;
  }

  public boolean isOverSpeedLimit() {
    return this.speed > Taxi.MAX_SPEED;
  }

  @Override  // Let the compiler to valicate the relationship of inheritance
  public void start() {
    if (isStopped()) {
      this.speed += 5;
    }
  }

  @Override
  public void stop() {
    if (isOn()) {
      this.speed = 0;
    }
  }

  @Override
  public void accelerate() {
    if (speed + 10 <= 100 && isOn()) {
      this.speed += 10;
    } else {
      this.speed = 100;
    }
  }

  @Override
  public void brake() {
    if (this.speed > 10) {
      this.speed -= 10;
    } else {
      this.speed = 0;
    }
  }


  public static void main(String[] args) {



}
}