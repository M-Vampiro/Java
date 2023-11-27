public class IntArray2 {
    public static void main(String[] args)  {

// int array 10, 8 , 6 , 4 , 2
int[] arr1 = new int[] {10 , 8 , 6 , 4 , 2 , 12 , 14 , 16};
// for loop ->
int sum = 0;
    for ( int i = 0 ; i < arr1.length ; i++ ) {
        sum += arr1[i];
   System.out.println("sum = " + sum);}

    // find the max sum

int sum1 =0; 

    for ( int i = 0 ; i < arr1.length ; i++ ) {
        sum1 += arr1[i];
        if (i < arr1.length - 1) {
            continue;}
        System.out.println("max sum is " + sum1);
        }

    // find the max value
    int max = 0; 
    for ( int i = 0 ; i < arr1.length ; i++ ) {
        if ( max <= arr1[i]) {
            max = arr1[i];
        }}
        System.out.println("max value is " + max);

    // find the min value
    int min = 0; 
    for ( int j = 0 ; j < arr1.length - 1 ; j++ ) {
        if ( arr1[j] > arr1[j + 1]) {
            min = arr1[j + 1];
        }
    }  
    System.out.println("min value is " + min);

    // second msx value

    int max2 = 0;
    max = 0;
    for ( int k = 0 ; k < arr1.length ; k++ ) {
        if ( max <= arr1[k]) {
            max2 = max;
            max = arr1[k];
        } else if (max2 <= arr1[k]) {
            max2 = arr1[k];
        }
    }

        System.out.println("The second max value is " + max2);

    


    



        }}

    

