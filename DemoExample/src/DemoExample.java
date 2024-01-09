public class DemoExample {
    public static void main(String[] args) {

        // The most popular runtime exceptions (unchecked exceptions)

        String s = null;
        // s.length(); // java.lang.NullPointerException: Cannot invoke
        // "String.length()" because "s" is null

        int x = 0;
        // double average = 100 / x; // java.lang.ArithmeticException: / by zero

        Object s2 = "hello";
        // Double result = (Double) s2; // java.lang.ClassCastException: class
        // java.lang.String cannot be cast to class java.lang.Double

    }
}
