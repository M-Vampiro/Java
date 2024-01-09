package Father;

import java.sql.Driver;

public class Father implements Driver {

  @Override
  public void driver;

  public static void main(String[] args) {
    Driver driver = new Father();
    driver.driver;

    Driver driver2 = new Father() {
      @Override
      public void drive() {
        System.out.println("Anonymous Inner Class ... driving ...");
      }
    }
  }

}
