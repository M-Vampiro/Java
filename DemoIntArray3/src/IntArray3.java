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






    }
}
