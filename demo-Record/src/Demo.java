public class Demo {
  public static void main(String[] args) {

    // Allow All-args constructor only
    Student student = new Student("John", 0);
    System.out.println(student.name());
    // No setter in Record

    // .toString()
    System.out.println(student); // Student[name=John, age=0]

    // .equals()
    Student student2 = new Student("John", 0);
    System.out.println(student.equals(student2));

    // .hashCode()
    System.out.println(student.hashCode()); // 71750709
    System.out.println(student2.hashCode()); // 71750709

  }
}
