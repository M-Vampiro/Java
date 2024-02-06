public class ASCII {
    public static void main(String[] args)  {
      char value = 'C';
      int ASCII = value; // 67
      System.out.println(ASCII);

        System.out.println( value == 'C' ); //true
        System.out.println( value == 67 ); //true
        System.out.println( value > 64 ); //true
        System.err.println( value < 64 ); // false

        char s = '好'; 
        int ASCII2 = s;
        System.out.println(ASCII2);;

        String s1 = "abcdef"; 
        String s2 = "banana";
        String s3 = "ABCABC";
        String s4 = "acbdef";
        String s5 = "abcA";

        System.out.println(s2.compareTo(s1)); // 1 'b'-'a'
        System.out.println(s1.compareTo(s2)); // -1 'a' - 'b'
        System.out.println(s3.compareTo(s2)); // -32 'A' - 'B'
        System.out.println(s4.compareTo(s1)); // 1 'c' - 'b'
        
        System.out.println(s5.compareTo(s1)); // 'A' - 'd'
      // First compare ASCII, then length

      


    }
}
