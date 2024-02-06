import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class DemoBigDecimal {

    public static void main(String[] args) {

        // Problem Statement: Addition
        double d = 0.2 + 0.1;
        System.out.println("d = " + d); // d = 0.30000000000000004

        if (d > 0.3)
            System.out.println("d > 0.3");

        // Soulution
        BigDecimal bd1 = new BigDecimal(0.2);
        BigDecimal bd2 = new BigDecimal(0.1);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println("bd3 = " + bd3);

        BigDecimal bd4 = BigDecimal.valueOf(0.2);
        BigDecimal bd5 = BigDecimal.valueOf(0.1);
        BigDecimal result = bd4.add(bd5);
        System.out.println("result = " + result);

        // Problem Statement: Subtraction
        double d2 = 0.3 - 0.1;
        System.out.println("d2 = " + d2); // d = 0.30000000000000004

        if (d2 < 0.2)
            System.out.println("d2 < 0.2");

        // Soulution
        BigDecimal bd6 = new BigDecimal(0.3);
        BigDecimal bd7 = new BigDecimal(0.1);

        BigDecimal bd8 = bd6.subtract(bd7);
        System.out.println("bd8 = " + bd8);

        BigDecimal result2 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
        System.out.println("result = " + result2);

        // Problem Statement: Multiply
        BigDecimal result3 = BigDecimal.valueOf(0.5).multiply(BigDecimal.valueOf(0.5));
        System.out.println(result3);

        // Problem Statement: Divide
        BigDecimal result4 = BigDecimal.valueOf(3).divide(BigDecimal.valueOf(2));
        System.out.println(result4.doubleValue());

        // Problem Statement: Remainder
        BigDecimal result5 = BigDecimal.valueOf(0.5).remainder(BigDecimal.valueOf(0.0003));
        System.out.println(result5);

        System.out.println("Method result = " + sum(-0.2, 0.1));

        // Comparison
        BigDecimal a1 = BigDecimal.valueOf(0.3);
        BigDecimal a2 = BigDecimal.valueOf(0.2);

        if (a1.compareTo(a2) > 0) {
            System.out.println("a1 > a2");
        } else if (a1.compareTo(a2) == 0) {
            System.out.println("a1 == a2");
        } else
            System.out.println("a1 < a2");

        BigDecimal result6 = BigDecimal.valueOf(1.0).divide(BigDecimal.valueOf(3.0), 2, RoundingMode.DOWN);
        System.out.println(result6.doubleValue());

        BigDecimal roundingDecimal = BigDecimal .valueOf(10)//
        .divide(BigDecimal.valueOf(3), 4 ,RoundingMode.DOWN) //
        .add(BigDecimal.valueOf(5.0)) //
        .subtract(BigDecimal.valueOf(2.1)) //
        .setScale( 2 , RoundingMode.DOWN);

        System.out.println(roundingDecimal.doubleValue());


        }



    

    public static double sum(double x, double y) {
        return (BigDecimal.valueOf(x).add(BigDecimal.valueOf(y))).doubleValue();

    }

}
