public class Demostring {
    public static void main(String[] args) {

    String emailAddress = "ynotrobot@gmail.com";
    //String s = 3; // s is declared by String, so you cannot assign int value
    //int 1 = "hello"; // 1 is declared by int, you cannot assign String value

    System.out.println(emailAddress); // ynotrobot@gmail.com

    String str1 = "hello, your" + " " + "world";

    String str2 = " " + "level is ";

    int level = 25;

    System.out.println(str1 + str2 + level + "!!!" );

    
    level = level + 25;
    level += 25;

    System.out.println(str1 + str2 + level + "!!!");

    level = level - 10;
    level -= 10;

    System.out.println(str1 + str2 + level + "!!!");

    level = level * 2;
    level *= 2;

    System.out.println(str1 + str2 + level + "!!!");

    level = level / 2;
    level /= 2;

    System.out.println(str1 + str2 + level + "!!!");

    double str3 = level;

    str3 /= 2;

    System.out.println(str1 + str2 + str3 + "!!!");

    // byte, short, int, long (primitive)
    byte b = -128; // from -128 to 127
    byte b1 = 127;
    //byte b2 = 128; // 128 is out of range of interger value that can be stored.

    short s = -32768; // from -32768 to 32767
    short s1 = 32767;

    int i = -2147483648; // from -2147483648 to 2147483647
    int i1 = 2147483647;

    long l = -9223372036854775808L; // from -9223372036854775808 to 9223372036854775807
    long l1 = 9223372036854775807L; // 21747483648 in int value
    //but out ranged

    short s2 = 100; // Java implicitly convert the int to byte
    byte b2 = 100; // Java implicitly convert the int to short

    l += 10L;
    System.out.println(l);

    level++;
    ++level;
    level--;
    --level;

    // the remeinder of 5 / 2 = 1
    int remeinder = 5 % 2; // -> 1
    System.out.println(remeinder);
 
    float result = 5 + 3f / 2 % 3;
    System.out.println("result = " + result);

    int r = 11 % 3;
    System.out.println(r);

    // No "-", "*", "/" in String

    System.out.println("the length is " + str1.length());

    // String supports "+", "+="

    // If, = , ==

    int x = 0; // Assignment
    int x2 = 3; // Assignment
    if (x == x2) { // Means asking if they're equal
    // "x == x2" returns is false, so the flow will not fall into this block
    System.out.println("x is equals to x2");
    } else {
        System.out.println("x is not equals to x2");
        // sysout is short cut for System.out.println()
    }

    // String is not a primitive, so you cannot use == to compare their values
    String s5 = "hello";
    String s6 = "hello";
    if (s5.equals(s6)) { //comparing the string variables
        System.out.println("s5 is equals to s6");
    }
    if ("hello".equals(s6)) { // comparing string value to a string variable
        // if (s6.equals("hello")) // don't code in this way
        System.out.println("s6 is hello");
    }
    if ("hello".equals("hello")) { // always ture
    System.out.println("ABC");
    }

    // charAt()
    // 4 is an index of String
    // Example: "hello", h -> index = 0
    // e -> index = 1
    // l -> index = 2
    // l -> index = 3
    // o -> index = 4
    //s5.charAt(4) return 'o'
    char c1 = s5.charAt(4); //o
    System.out.println(c1);

    s5 = "Vampiro";
    //what if we always get the last character of the String
    //approach 1
    int lastindex = s5.length() - 1;
    c1 = s5.charAt(lastindex);
    System.out.println(c1);
    //approach 2
    c1 = s5.charAt(s5.length() - 1) ;
    System.out.println(c1);
    // This is pratice down below

    int I = 30;

    String T = "Today's temperture is ";

    char Unit = 'C';

    System.out.println(T + I + Unit);

    
    }

}
