public enum Directions {

  East(1), //
  West(-1), //
  North(2), //
  South(-2),//
  ;

  private int value;

  private Directions(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // static method
  public static Directions opposite(Directions directions) {
    return Directions.fromValue(directions.getValue() * -1);

  }

  // boolean

  public static boolean isOpposite(Directions d1, Directions d2) {
    return (Directions.fromValue(d1.getValue()) == Directions.fromValue(d2.getValue() * -1));
  }

  // instance method
  public Directions opposite() {
    return Directions.fromValue(this.value * -1);

  }
  // boolean

  public boolean isOpposite(Directions d1) {
    return this == Directions.fromValue(d1.getValue());

  }

  private static Directions fromValue(int value) {
    for (Directions directions : values()) {
      if (directions.getValue() == value) {
        return directions;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    String result = Directions.East.opposite().name();
    String result2 = Directions.East.opposite().name().toString(); // Enum.class toString() result2
    int result3 = Directions.East.opposite().hashCode(); // Enum.class hashcode() result3

    System.out.println(result); // result = West
    System.out.println(Directions.East.opposite()); // result = West
    System.out.println(opposite(East));
  }
}
