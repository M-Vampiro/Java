public class DemoConversion {
    public static void main(String[] args) {
      
        // byte -> short -> int -> long
        byte b = 2;
        short s1 = b; // Ok, upcast, no precision loss
        int i1 = s1; // Ok, upcast, no precision loss
        long l1 = i1; // Ok, upcast, no precision loss

        System.out.println(b + " " + s1 + " " + i1 + " " + l1);

        // long -> int -> short -> byte
        long l2 = 4L;
        //short s2 = l2; // Not ok. potentially precision loss
        short s2 =(short) l2; // fixed, Risky
        l2 = 40000; // 40000 -> int value
        s2 = (short) l2; // overflow

        System.out.println("s2 = " + s2); // -25536

        short s3 = 130; 
        byte b2 = (byte) s3; // overflow -126
        System.out.println("b2 = " + b2);

        int i2 = 130;
        short s4 = (short) i2;
        System.out.println("s4 = " + s4);

        s2 = (short) l2; //overflow
        System.out.println("s2 = " + s2);

















    }
}
