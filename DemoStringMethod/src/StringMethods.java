import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "  Hello World!!  ";
        // empty
        if ((!str.isEmpty())) {
            System.out.println("String" + str);
        }
        System.out.println("str length" + str.length());

        // charAt()
        // even number indew of the character in string
        for (int i = 1; i < str.length(); i++)
            if (i % 2 == 0) {
                System.out.println(str.charAt(i));
            }
        ;

        System.out.println();

        // subString()
        String s = "Hello";
        String newStr = s.substring(2, 4);// Index start from 0
        System.out.println("newStr" + newStr); // ll, print -> index from 2 to 3.
        System.out.println(newStr.substring(0));

        // trim(), remove all spaces in the head and tail of the string
        // str = "...hello world... "
        System.out.println(str.trim()); // "hello world"
        System.out.println(newStr.trim()); // "ll"

        String s2 = "Hello, wORld";
        System.out.println(s2.toUpperCase()); // HELLO, WORLD
        System.out.println(s2.toLowerCase()); // hello, world

        // equals()
        // equalsIgnoreCase()
        System.out.println("HELLo, woRld!!".equals("hello, world!!")); // false
        System.out.println("HELLo, woRld!!".equalsIgnoreCase("hello, world!!")); // true
        System.out.println("HELLo, woRld!!".equalsIgnoreCase("hello")); // false

        // startsWith("")
        // endWith("")
        System.out.println(s2.startsWith("Hello")); // true
        System.out.println(s2.startsWith("HEllo")); // false
        System.out.println(s2.startsWith("H")); // true
        System.out.println(s2.startsWith(".")); // false
        System.out.println(s2.startsWith("")); // true

        System.out.println(s2.endsWith("wORld")); // true
        System.out.println(s2.endsWith("world")); // false
        System.out.println(s2.endsWith("d")); // true
        System.out.println(s2.endsWith(".")); // false
        System.out.println(s2.endsWith("")); // true

        String s3 = "1234567890";
        // you try 2 String methods, and use && operator to check true/false
        // return true

        String str3 = s3.substring(3, 6);
        System.out.println(s3.length() == 10 && s3.startsWith("1")); // true
        System.out.println(
                "56".equals(s3.substring(4, 6)) && s3.charAt(s3.length() - 1) == '0');

        // indexOf()
        System.out.println(s3.indexOf('7')); // 6 (int)
        System.out.println(s3.indexOf('m')); // -1 (int)

        // searching '7' starting from index 0
        System.out.println(s3.indexOf('7', 8)); // -1 (int)

        // lasIndexOf()
        String s4 = "1234512345";
        System.out.println(s4.indexOf('5')); // 4, return the first occurence of '5'
        System.out.println(s4.lastIndexOf('5')); // 9 return the last occurence of '5'

        System.out.println(s4.indexOf("345")); // 2
        System.out.println(s4.lastIndexOf("45 6")); // -1

        System.out.println(s4.lastIndexOf("345")); // 7
        System.out.println(s4.lastIndexOf("34 5"));
        ; // -1

        System.out.println(s4.lastIndexOf('4', 7)); // 3
        System.out.println(s4.lastIndexOf('4', 2)); // -1

        String s5 = "ABabc.abcdef";
        System.out.println(s5.lastIndexOf("abc") == 6 //
                && s5.endsWith("def") //
                && s5.indexOf("abc") == 2 //
                && s5.startsWith("ABa") //
                && s5.length() > 10); // true

        String s6 = "abc";
        String s7 = "def";
        System.out.println(s6 + s7);
        System.out.println(s6.concat(s7));

        System.out.println(s5.contains("abcdef")); // true
        System.out.println(s5.indexOf("abcdef") != -1); // true

        System.out.println(s5.contains("xxx")); // false

        String result = s5.toUpperCase();
        System.out.println(result); // ABABC.ABCDEF
        String result2 = result.substring(3, 5); // BC
        System.out.println(result2);

        String result3 = s5.toUpperCase().substring(3, 5); // BC
        System.out.println(result);

        String result4 = s5.toUpperCase().substring(1, 2).concat("ijk");
        System.out.println(result4);

        String str2 = "abc,def,fgh,jkl";
        String[] arr2 = new String[] {};
        arr2 = str2.split(",");
        System.out.println(Arrays.toString(arr2));

        String columnTitle = "AB";
        int total = 0;
        char[] c = columnTitle.toCharArray();
        int[] n = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            n[i] = (int) (c[i] - 64);
        }
        System.out.println(Arrays.toString(n));

        System.out.println(n[n.length - 1]);

        for (int j = n.length - 1; j > 0; j--) {
            total += Math.pow(26, j) * n[j - 1];
        }
        System.out.println(total);
        System.out.println(n[n.length - 1]);
        total += n[n.length - 1];
        System.out.println(total);


        char[] arr = String.valueOf(12345).toCharArray()

    }
}
