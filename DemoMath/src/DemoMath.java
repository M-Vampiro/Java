import java.text.DecimalFormat;
import java.util.Random;

public class DemoMath {
    private static final DecimalFormat df = new DecimalFormat("0");
    public static void main(String[] args) {
        // pow()
        System.out.println(Math.pow(2.0, 10)); // 2^10
        System.out.println(Math.pow(2.0, -1)); // 1/ 2^1
        System.out.println(Math.pow(2.0, -2)); // 1/ 2^2

        // abs(), absolute value
        System.out.println(Math.abs(3.2)); // 3.2
        System.out.println(Math.abs(-3.2)); // 3.2

        // cell(), floor()
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.9)); // 4.0

        System.out.println(Math.floor(3.1)); // 3.0
        System.out.println(Math.floor(3.9)); // 3.0

        // round()
        System.out.println(Math.round(14.4)); // 14
        System.out.println(Math.round(14.5)); // 15
        System.out.println(Math.round(14.44)); // 14
        System.out.println(Math.round(14.45)); // 14

        int[] arr = new int[] { -2, 10, 100, -40 };
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(arr[i], max);

        }
        System.out.println("Max value = " + max);
        System.out.println(Math.min(7.5, 6.8));

        // SquareRoot
        System.out.println(Math.sqrt(81));
        System.out.println(Math.sqrt(-81));

        double d1 = Math.sqrt(-81);
        System.out.println(d1);
        if (d1 > 9) {
            System.out.println("d1 is bigger than 9");
        } else if (d1 < 9) {
            System.out.println("d1 is smaller than 9");
        }
        if (Double.isNaN(d1)) {
            System.out.println("d1 is NaN");
        }

        int random1 = new Random().nextInt(3); // 0 , 1 , 2
        double random2 = Math.random(); // 0.0 - 1.0 inclusively
        System.out.println(random2);

        // 1-10
        int random3 = (int) (Math.random() * 10);
        System.out.println(random3);

        Integer random4 = Integer.valueOf(String.valueOf(df.format(Math.random() * 10)));
        System.out.println("Random4 = " + random4);

        // int x = 3.5 + 4;
        int y = 7;
        y += 3.5; // implicitly downcast
        y = (int) (y + 3.5); // explicitly
        System.out.println(y);

    }
}
