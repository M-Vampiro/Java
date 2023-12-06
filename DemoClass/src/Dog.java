public class Dog {

  public static int sum(int... integer) {
    int sum = 0;
    for (Integer i : integer) {
      sum += i;
    }
    return sum;
  }

  public static int sum2(int[] integer) {
    int sum = 0;
    for (Integer i : integer) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4, 5));
    System.out.println(sum(new int[]{ 1, 2, 3, 4, 5}));

  }
}