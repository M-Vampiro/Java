import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intarray {
    public static void main(String[] args) {
       
int age1 = 20;
int age2 = 25;
int age3 = 30;
int age4 = 28;

// Define an array [container] to store a list of int number
// This array (container) can only store int number
int[] arr = new int[9]; // [length of array], by index 0 - 8
// Assignment
arr[0] = 20;
System.out.println("arr[0]=" + arr[0]); //20
arr[1] = 25;
System.out.println("arr[0]=" + arr[1]); //25
arr[2] = 30;
System.out.println("arr[0]=" + arr[2]); //30
arr[3] = 28;
System.out.println("arr[0]=" + arr[3]); //28

// arr[9] = 20; // error, no index 9 in array arr

int a; // local variable
a = 1; // explicity assignment
System.out.println(a); // you have to explicitly assign value to use it.

int[] arr2 = new int[5];
int[] arr3 = new int[] {100, 5, 30, 9, -40};

double[] arr4 = new double[] {1.2 , 4.9 , 4.3 , 23.0};

arr2 = new int[10];
System.out.println(arr2.length); // 5

// array supports for loop

int b = 100;
b = 1000;
System.out.println(b);

// default value of int[]
int [] arr5 = new int[5];
for ( int i = 0 ; i < arr5.length ; i++) {
    // arr5 is storing the address of the array object.
    // we use arr[5] find out the 3 values stored in the array object
    System.out.println("arr[i] = " + arr5[i]);

    String str = "hello";
    String str2 = new String("hello"); // str2 is storing the address of String
    String str3 = String.valueOf("hello");//

 List<String> strs = new ArrayList<>(List.of("one.two.three","four.five","six"));
 System.out.println();

 String[] strr = strs.toArray(new String[strs.size()]);
 System.out.println(Arrays.toString(strr));
 List<String> res = new ArrayList<>();
 res.addAll(Arrays.asList(strr[0].split(".")));
 System.out.println(res);
 





} 












    }
}
