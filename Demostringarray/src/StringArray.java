import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        // "abc" "ilk" "xyz"
        String[] strings = new String[] { "abc" , "def" , "xyz"};
        String[] strings2 = new String[3];
        strings2[0] = "abc";
        strings2[1] = "ijk";
        strings2[2] = "xyz";

        // for loop
        //strings2[0] = "abc";
        //strings2[1] = "def";
        //strings2[2] = "xyz";
        for ( int i = 0 ; i < strings.length ; i++ ) { // 0, 1, 2
            // code here
            if  (i < strings.length - 1) {
            strings[i] = strings[i].concat(strings[i + 1]);
        } else {
            strings[i] = strings[i].concat("!");}

            System.out.println(strings[i]);
    }

            System.out.println(Arrays.toString(strings));


    for ( int i = 0 ; i < strings2.length ; i++ ) { // 0, 1, 2
            // code here
            if  (i < strings2.length - 1) {
            strings2[i] = strings2[i].concat(strings2[i + 1]);
            System.out.println(strings2[i]);
        continue;}
            strings2[i] = strings2[i].concat("!");
            System.out.println(strings2[i]);

    }
        System.out.println(Arrays.toString(strings));

        String s = "abcabcabcabcabc";
        char[] arr7 = new char[s.length()];

       // Approach 1
     
        for ( int i = 0 ; i < s.length() ; i++ ) { 
            //chatAt
            arr7[i] = s.charAt(i);
        }

        // Approach 2
        
        char[] arr8 = s.toCharArray(); //

        // replace a -> c
        // "cbccbccbccbccbc"
        int asciicode = 0;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( (int) s.charAt(i) == 'a') {
               asciicode = (int) s.charAt(i)  + 2;
               arr8[i] = (char) asciicode;
               continue;
            } 
            arr8[i] = s.charAt(i);
        } System.out.println(Arrays.toString(arr8));

        String str = "hello";
        str = new String("hello");
        str = String.valueOf("hello");

        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(1.0d));
        System.out.println(String.valueOf(1.0f));
        System.out.println(String.valueOf(1L));
        System.out.println(String.valueOf(new char[] {'a' , 'b'})); //ab
        //System.out.println(String.valueOf(new int [] {1,2,3})); // NOT ok

        // Replace (String method)
        String str4 = "abcabcabcabcabc";
        String result4 = str4.replace('a', 'c'); //replace a by c
        System.out.println("result4 = " + result4); //result 4 = cbccbccbccbccbc
        System.out.println("str4 =" + str4);

        System.out.println(str4.replace("ab" , "ij")); //ijcijcijcijcijc







        
    }
}
