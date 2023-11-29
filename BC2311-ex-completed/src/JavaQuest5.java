
public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    char target2 = 'z';
    // Use a loop to count the target of character in a String.
    // code here
    int target1count = 0;
    int target2count = 0;
for ( int i = 0 ; i < str.length() ; i++ ) {
  if (str.charAt(i) == target) {
      target1count++;
  } else if (str.charAt(i) == target2) {
    target2count++;
  }
}
    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
if (target1count > 0) {
  System.out.println("We found " + target1count + " character " + target + " in the String.");
} else System.out.println("Not Found.");
if (target2count > 0) {
  System.out.println("We found " + target2count + " character " + target2 + " in the String.");
} else System.out.println("Not Found.");


  }
}