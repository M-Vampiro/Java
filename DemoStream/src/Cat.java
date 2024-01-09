public class Cat {

  // name
  // age
  private String name;
  private int age;

  public Cat(String name, int age) {
    this.age = age;
    this.name = name;
  }

  private Cat(Builder builder) {
    this.age = builder.age;
    this.name = builder.name;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static Builder Builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "Cat name: " + this.name
    + " Cat age: " + this.age;
  }

  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Cat build() {
      return new Cat(this.name, this.age);
    }

  }

  

}
