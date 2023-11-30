public class DemoStringLiteral {
    public static void main(String[] args) {
    

    String s1 = "John";
    String s2 = "John";

    System.out.println(s1.equals(s2)); // true (same value)
    // ==, check if they are the same Obj.
    System.out.println(s1 == s2); // true, check if they are same object

    String s3 = new String("John");
    System.out.println(s1.equals(s3)); // true, they are the same value
    System.out.println(s1 == s3); // false, they are different Obj.

    String s4 = String.valueOf("John");
    System.out.println(s1.equals(s4)); // true, same value
    System.out.println(s1 == s4); // true, s4 String obj. is in Literal Pool
    System.out.println(s2 == s4); // true, s4 String obj. is in Literal Pool
    System.out.println(s3 == s4); // false, different obj.

    s1 = "John2";
    System.out.println(s1 == s2); // false, different value, different Obj
    System.out.println(s2 == s4); // true

    s2 = s2 + "3"; // "john3"
    System.out.println(s2 == s4); //false;

    s2 = "John";
    s2 = s2 + "2"; // "John2"
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s2); // false






    }
}
