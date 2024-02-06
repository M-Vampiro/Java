public class DemoCounting {
    public static void main(String[] args)  {
       
        int[] arr = new int[] {10, -2, -200, 2000, 2000, -2, -2};
        // int[] counts = new int[]
        int maxCount = 1;
        int maxCount2 = 1;
        int number = 0;

        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = 1 ; j < arr.length ; j++ ) {
        
        if (number != arr [i]) {
            continue;
        } else if (arr[i] == arr[j]) {
            arr[i] = number;
            maxCount++;}
        }
    }


            
        System.out.println("maxCount is " + (maxCount)); // 3



















        



    }
}
