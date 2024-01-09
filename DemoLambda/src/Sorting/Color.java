package Sorting;

public enum Color {

  Red("RED"),
  Blue("BLUE"),
  Green("GREEN"),
  Yellow("YELLOW"),;

  private String name;

  private Color(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

}
