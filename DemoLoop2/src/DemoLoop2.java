import java.util.Arrays;

public class DemoLoop2 {
    public static void main(String[] args) {

        Integer[] Integers = new Integer[] { 100, -32, 20 };
        for (Integer i : Integers) {
            System.out.println("i =" + i);

        }

        for (int i = 0; i < Integers.length; i++) {

            System.out.println("i =" + i);
        }

        String str = "abc,def,ijk,zxy";
        String[] parts = str.split(",");
        for (String i : parts) {
            System.out.println("Parts = " + i);

            Integer[] Integers2 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
            for (Integer j : Integers2) {
                System.out.println("num = " + j);
            }
        }

        String str2 = "abcdefghijk";
        // char array
        // finalString = "acegik"
        char[] arr = str2.toCharArray();
        int arrLength = str2.length() % 2 == 0 ? str2.length() / 2 : str2.length() / 2 + 1;
        char[] result = new char[arrLength];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[idx++] = arr[i];
            }
        }
        System.out.println("Final String " + String.valueOf(result));

        System.out.println("Final String " + evenIndex(str2));

        System.out.println("Reverse String " + reverse(str2));
        System.out.println("Reverse String " + reverse2(str2));
        System.out.println("Reverse String " + reverse3(str2));

        System.out.println(reverse("123456789"));
        System.out.println(reverse2("123456789"));
        System.out.println(reverse3("123456789"));

    }

    public static String evenIndex(String s) {
        char[] characters = s.toCharArray(); // toCharArray() -> new char[str2.length()]
        // finalString -> "acegik"
        int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        char[] result = new char[arrLength];
        int idx = 0;
        for (int i = 0; i < characters.length; i++) {
            if (i % 2 == 0) {
                result[idx++] = characters[i];
            }
        }
        return String.valueOf(result);
    }

    public static String reverse(String s) {
        char[] characters = s.toCharArray();
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[i] = characters[s.length() - i - 1];
        }

        return String.valueOf(result);

    }

    public static String reverse2(String s) {
        char[] characters = s.toCharArray();

        char temp = ' ';

        for (int i = 0; i < s.length() / 2; i++) {
            temp = characters[i];
            characters[i] = characters[s.length() - i - 1];
            characters[s.length() - i - 1] = temp;
        }
        return String.valueOf(characters);
    }

    public static String reverse3(String s) {
        String result = "";
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
                result = result.concat(s.substring(i, i + 1));
            
        }
        return result;

    }

}