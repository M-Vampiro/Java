public class DemoRecursion {
    public static void main(String[] args) {
        // 1 + 2 + 3 + 4 + 5 = 15
        int sum = 0;
        int n = 100;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum); // 15

        // recursion: Given int n, return n + (n - 1) + (n - 2) + 1
        System.out.println(sum(5));

        // recursion: Given int n 
        // if n is odd, return n = (n - 2) * (n - 4)... * 1
        // if n is even, return n = (n - 2) * (n - 4)... * 2
        System.out.println(multiply(10));

    }

    public static int sum(int n) { // n = 5
        // base critiria
        if (n == 1) {
            return 1;
        }
        return n += sum(n - 1);
    }
    // Step1 : sum(5) -> return 5 + sum(4)
    // Step2 : sum(4) -> return 4 + sum(3)
    // Step3 : sum(3) -> return 3 + sum(2)
    // Step4 : sum(2) -> return 2 + sum(1)
    // Step5 : sum(1) -> return 1

    public static int multiply(int n) {
        if (n <= 3) {
            return n;
        } return n *= multiply(n - 2); 
    }

}
