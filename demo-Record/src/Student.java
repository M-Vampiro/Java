// Kind of Class

public record Student(String name, int age) { // Final Attribute

  public static int test = 1;

  public void read() {
    System.out.println(" I'm reading ... ");
  }

  public static void sleep() {
    System.out.println(" I'm sleeping ... ");
  }

  // public Student() {

  // }

  // public Student(String name) {
  //  this.name = name;
  // }

  // All attributes in "record" have been finalized
  // public void setName(String name) {
  //   this.name = name;
  // }


}
