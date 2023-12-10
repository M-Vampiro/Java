public class DemoString {
    public static void main(String[] args) {
        // Quiz
        String str1 = "hello";
        String str2 = "hello"; // check if "hello" exists in String Literal pool
        // so that JVM can reuse "hello' obj by various obj. referver"

        System.out.println(str1.equals(str2)); // true
        System.out.println((str1 == str2)); // true, literal pool

        String str3 = "hello!"; // false
        System.out.println(str1.equals(str3)); // false, different value

        String str4 = new String("hello"); 
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1 == str3);   // false, "new" force creating an obj

        String str5 = String.valueOf("hello");
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1 == str5);   // true, look up literal

        // Concentration
        String str7 = "abc";
        String str8 = str7 + "def"; // there will be 2 strings obj in literal pool

        //
        String str9 = "aaa";
        String str10 = new String("aaabbb");
        String str11 = "aaabbb";
        System.out.println(str10 == str11); // false

        String str13 = "aaa";
        String str14 = new String("aaabbb");
        System.out.println(str13 == str14); // false


        if ("hello".equals(str5)) {// best pratice to check the value of String
        System.out.println("str5 is equal to hello");}

        // Java Compiler would NOT look at the value assigned to obj. referance during the
         //   String str6 = null;
        //    if (str6.equals("hello")) {
          //      System.out.println(" It is bad to pratice to check String Value");
         //   }


    }
    }
