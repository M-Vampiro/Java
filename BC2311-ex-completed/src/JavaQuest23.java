/* Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public boolean sameNumberOfVowels(String s) {
    // code here ...
    StringBuilder sb = new StringBuilder(s.substring(0, s.length() / 2));
    StringBuilder sb2 = new StringBuilder(s.substring(s.length() / 2, s.length()));
    char[] arr = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    int count = 0;
    int count2 = 0;
    for (int i = 0 ; i < arr.length; i++) {
      for (int j = 0 ; j < sb.length() ; j++) {
        if (sb.charAt(j) == arr[i]) {
          count++;
        }
        if (sb2.charAt(j) == arr[i]) {
          count2++;
        }

      }
    }
    return count == count2;
  }
}

