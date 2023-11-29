/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here
    secondMax = 0;
    int Max = 0;
    for ( int i = 0 ; i < nums.length ; i++ ) {
      if (Max < nums[i]) {
        secondMax = Max;
        Max = nums[i];
      } else if (secondMax < nums[i]) {
        secondMax = nums[i];
       }
    }
    System.out.println("Second Max = " + secondMax);

    secondMax = 0;
    Max = 0;
    for ( int i = 0 ; i < nums2.length ; i++ ) {
      if (Max < nums2[i]) {
        secondMax = Max;
        Max = nums2[i];
      } else if (secondMax < nums2[i]) {
        secondMax = nums2[i];
       }
    }
    System.out.println("Second Max = " + secondMax);

    secondMax = 0;
    Max = 0;
    for ( int i = 0 ; i < nums3.length ; i++ ) {
      if (Max < nums3[i]) {
        secondMax = Max;
        Max = nums3[i];
      } else if (secondMax < nums3[i]) {
        secondMax = nums3[i];
       }
    }
    System.out.println("Second Max = " + secondMax);

    secondMax = 0;
    Max = 0;
    for ( int i = 0 ; i < nums4.length ; i++ ) {
      if (Max < nums4[i]) {
        secondMax = Max;
        Max = nums4[i];
      } else if (secondMax < nums4[i]) {
        secondMax = nums4[i];
       }
    }
    System.out.println("Second Max = " + secondMax);



  }
}