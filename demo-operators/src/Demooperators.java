import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Demooperators {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        int x = 2;
        x++;
        ++x;
        x += 1;
        x = x + 1; // 6

        // difference between x++ and ++x
        int a = 5;
        int preIncement = ++a; // a is imcrement by 1 first, and then being assigned
        // a --> 6 first, then preIncrement --> 6
        System.out.println(a);
        System.out.println(preIncement);

        int b = 5;
        int postIncement = b++; // assign the value of a variable a to postIncement first
        // postIncement -> 5, b -> 6
        System.out.println(b); // 6
        System.out.println(postIncement); // 5

        int postIncement2 = b++;
        System.out.println(b); // 7
        System.out.println(postIncement2); // 6

        ++b; // b = b + 1

        int b2 = 5;
        preIncement = --b2;
        System.out.println(b2);
        System.out.println(preIncement);
        b2 = 5;
        preIncement = b2--;
        System.out.println(b2);
        System.out.println(preIncement);

        // b = 5
        // b2 = b++;
        // step 1
        // b2 = b = 5 // b2 = 5, b = 5
        // step 2
        // b = b + 1 // b2 = 5, b = 6
        // System.out.println(b2) // 5

        // b = 5
        // b2 = ++b;
        // step 1
        // b = b + 1 // b = 6
        // step 2
        // b2 = b = 6 // b2 = 6, b = 6
        // System.out.println(b2) // 6

        // Conditional Operaters
        // && ||
        if (a == 1 && b == 2) { // && -> Both condition need to be fulfilled
            // (a == 1) -> true
            // (b == 2) -> false
            // true && false -> false
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (a == 1 || b == 2) { // || -> Either one condition need to be fulfilled only
            // (a == 1) -> true
            // (b == 1) -> false
            // true || false -> true
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // Example 4 - AND
        if (a == 2 && b == 5) {
            // (a == 2) -> false
            // (b == 6) will not be executed
        }

        Boolean phone = true;
        Boolean laptop = true;
        String password = "12345678";

        if ("12345678".equals(password) && (phone == true || laptop == true)) {
            System.out.println("Can watch YouTube");
        } else {
            System.out.println("Cannot watch YouTube");
        }

        // Comparsion operators NOT only exists in if statements
        // boolean -> && ||
        boolean b1 = true && false;
        System.out.println("b1=" + b1); // false

        boolean b3 = false;
        boolean b4 = true;

        boolean result = b3 || b4;
        System.out.println("result = " + result); // true
        boolean result2 = b1 || b3 & b4;
        System.out.println("result2 = " + result2); // false

        if (b1 == false) {
            System.out.println("b1 is false"); // print
        }
        if (!b1) { // b1 = false
            System.out.println("example 7b=b1 is false"); // print
        }
        if (b1 == true) {// b1
            System.out.println("example is true");
        }
        int g = 0;
        if (b1 = false) {
            g = 10;
        }

        int k = b1 == false ? 10 : 0;
        System.out.println("km" + k);
        // if b1 is false, assign 10 to k, otherwise 0

        int a1 = 10;
        int a2 = 2;
        int min;

        if (a1 < a2) {

            min = a1;
        } else { // a1 == a2 or a1 > a2
            min = a2;
        }
        System.out.println("min=" + min);

        int number = 13;

        if (number % 2 != 0) {
            System.out.println("The numnber is even!");
        } else {
            System.out.println("The number is odd!");
        }

        boolean isOdd;

        if (number % 2 != 0) {
            isOdd = true;
        } else {
            isOdd = false;
        }
        System.out.println("Odd Number? " + isOdd);

        double totalAmount;
        int itemTotal = 1989;
        // If itemTotal = 3000, No transportation fee, otherwise +3% fee

        String fee = itemTotal < 3000 ? "+3%" : "free";
        if ("+3%".equals(fee)) {
            totalAmount = itemTotal * 1.03;
            df.setRoundingMode(RoundingMode.UP);
            System.out.println("You need to pay " + itemTotal + "$ + " + df.format(itemTotal * 0.03)
                    + "$ transportation fee. Your total amount is " + totalAmount + "$.");
        } else {
            System.out.println("You need to pay " + itemTotal + "$. No transportation fee");
        }

        // <, >, >=, <=, !
        boolean isPassed = false;
        if (!isPassed) { // = false}
            System.out.println("isPassed is false");
        }

        isPassed = true; // re-assignment
        if (isPassed) { // = true}
            System.out.println("isPassed is true");
        }

        String str = "www.apple.com";
        if (str.length() < 10 || "www.apple.com".equals(str)) {
            System.out.println("length < 10 or www.apple.com");
        }

        String s = " "; // empty string, length = 0
        System.out.println(s.length()); // 0
        s += "hello";
        if (!s.isEmpty()) {
            System.out.println("s is NOT empty");
        }

    }

}
