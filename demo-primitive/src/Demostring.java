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

    str2+= str2;
    
    System.out.println(str2);
        

    
    }

}
