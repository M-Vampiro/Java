public class Student implements Comparable<Student> {

  private int score;
  private String name;

  public Student(String name, int score) {
    this.score = score;
    this.name = name;
  }

  public int getScore() {
    return this.score;
  }
  public String getName() {
    return this.name;
  }

  @Override
  public int compareTo(Student o) {
    if (o.getName().compareTo(this.name) > 0) {
      return -1;
    } else if (o.getName().compareTo(this.name) == 0) {
      if ( o.getScore() > this.score) {
        return 1;
      }
    } 
      return 1;
    
  }

  @Override
  public String toString() {
    return "Student(" //
        + "Name =" //
        + this.name //
        + ", "
        + "Score =" //
        + this.score //
        + ")";
  }
}
