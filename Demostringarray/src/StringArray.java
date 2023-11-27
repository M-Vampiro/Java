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







        
    }
}
