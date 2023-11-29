import java.util.Arrays;

public class IntArray3 {
    public static void main(String[] args) {
        
        int[] arr = new int[] {100 , -100 , 34};

        // for loop
        // (-100 , 100 , 34)
        int r = 0;
        for ( int i = 0 ; i < arr.length - 1 ; i++ ) 
        {
            if (arr[i] != arr[i + 1]) { 
            // Swapping
            r = arr[i];
            arr[i] = arr [i + 1];
            arr[i + 1] = r;
            }
        }
System.out.println(Arrays.toString(arr));

// move target Index value to the tail of the array

    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int r2 = 0;
    // for loop
        for ( int i = 0 ; i < arr2.length - 2 ; i++ ) 
        {
            if (arr2[i + 1] != arr2[i + 2]) { 
            // Swapping
            r2 = arr2[i + 2];
            arr2[i + 2] = arr2[i + 1];
            arr2[i + 1] = r2;
            }
        }

        System.out.println(Arrays.toString(arr2));

        // Find max value, and move to the tail

        int[] arr3 = new int[] {100 , 4 , 1050 , 500 , -20};
        int r3 = 0;
        int temp = 0; 
        int max = 0;
        for ( int i = 0 ; i < arr3.length ; i++ )
        if (arr3[i] > max) {
            max = arr3[i];
            r3 = i;
            }
            System.out.println("The max value is " + max + " and the position is " + r3);


        for ( int i = 0 ; i < arr3.length - r3 - 1 ; i++ ) {
            if (arr3[i + r3] != 0) {
                temp = arr3[i + r3];
                arr3 [i + r3] = arr3 [i + r3 + 1];
                arr3 [i + r3 + 1] = temp;
            }
        }
            System.out.println("The final array will be " + Arrays.toString(arr3) );

            
            int temp2 = 0;

            int[] arr4 = new int[] {100 , 4 , 1050 , 500 , -20};
        
            for ( int i = 0 ; i < arr4.length - 1 ; i ++ ) {
                for ( int j = 0 ; j < arr4.length - 1 ; j++) {
                    if  ( arr4[j] > arr4[j + 1]) {
                        temp2 = arr4[j];
                        arr4[j] = arr4[j + 1];
                        arr4[j + 1] = temp2;
                    }
                    }
                    }
      System.out.println("The final array4 will be " + Arrays.toString(arr4) );
           




        // Insertion Array sorting
        int temp3 = 0;
        int[] arr5 = new int[] {100, -30, 40, 22, 44} ;
        for ( int j = 0 ; j < arr5.length ; j++) {
        for ( int i = 0 ; i < arr5.length - 1; i++) {
            if (arr5[i] > arr5[i + 1]) {
                temp3 = arr5[i];
                arr5[i] = arr5 [i + 1];
                arr5 [i + 1] = temp3; 
            }}
        } 
        System.out.println(Arrays.toString(arr5));


        // Reversion Array sorting
        int temp4 = 0;
        int[] arr6 = new int[] {100, -30, 40, 22, 44} ;
        for ( int j = arr6.length - 1 ; j > 0 ; j--) {
        for ( int i = arr6.length - 1 ; i > 0; i--) {
            if (arr6[i - 1] < arr6[i]) {
                temp4 = arr6[i - 1];
                arr6[i - 1] = arr6[i];
                arr6[i] = temp4; 
            }}
        } 
        System.out.println(Arrays.toString(arr6));

        
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
