import java.util.Arrays;

public class DemoMethod2 {
    public static void main(String[] args)  {   
        
    int [] arr = new int[] { 3 , 5 , 10};
    System.out.println(sum(arr)); //18
    addOne2(arr);
    System.out.println(Arrays.toString(arr));


    
    }

    public static int sum(int [] arr) {
        int sum = 0;
        for ( int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Wrong approach

    public static int [] addOne(int [] arr) {
        for ( int i = 0 ; i < arr.length ; i++) {
            arr[i]++; 
        }
        return arr;
    }
    
    public static void addOne2(int [] arr) {
        for ( int i = 0 ; i < arr.length ; i++) { // pass by referance
            arr[i]++; 
        } }
    public static void concatHello(String s) { // String is "Pass by value"
        s = s.concat("Hello");
}
    public static String concatHello2(String s) { // String is "Pass by value"
        s = s.concat("Hello");
        return s;
}
// Primitive + Wrapper class + String (17 types)-> pass by value
// array and classes -> pass by reference.











}
