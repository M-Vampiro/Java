public class DemoMethod {

    // main -> method name
    // public -> or private
    // static method -> tool
    // void -> return type
    public static void main(String[] args)  {
        // javac -> compile command, converting .java -> .class
        // java -> run .class file
        int x = 2;
        int y = 10;
        x *= 2; // 4
        x += y;
        System.out.println("x = " + x); // 14

        y = 100;
        x = 2;
        x *= 2; // 4
        x += y;
        System.out.println("x = " + x); // 104

        // Trigger Method

        int result10 = sum(10 , 3);
        System.out.println(result10); //13
        System.out.println(sum(2, 4));
        System.out.println(sum(-10, -20));

        int divide = divide(30 , 15);
        System.out.println(divide);

        int total = sum(new int[] {100 , 123, 333 ,546 , 999, });
        
        System.out.println("Total = " + total);
        int result = divide(10 , 3);
        int reminder = reminder(10, 3);
        System.out.println(result + " " + reminder);

    //return "abcdef"

    String s1 = append("abc", "def");
    System.out.println(s1);

    // Set the last character of the String s
    char s2 = getLastChar("abcdef");
    char s3 = getLastChar("");
    System.out.println(s2);
    System.out.println(s3);

    //return ture

    boolean s4 = isStartedWith("helloworld" , "hello");
    System.out.println("It is " + s4);


    // Return "abcabc"

    String s5 = toBeRemove("abcdefabc" , "def");
    System.out.println(s5);












    }

    // Method name; sum
    // return type; int
    // parameters; No parameters, one or more than one parameters
    // f(x1 , x2) = x1 + x2
    // y = x1 + x2
    public static int sum(int x1 , int x2) {
        int total = x1 + x2;
        return total;
    }
    // Must fulfill either one requiremnts
    // 1. Method name is different
    // 2. Method signiture is different
    public static int divide(int x1 , int x2) {
        int Quotient = x1 / x2;
        return Quotient;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for ( int i : arr) {
         sum += i;}
         return sum;
    }
    public static double sum(double[] arr) {
        double sum = 0;
        for ( double i : arr) {
         sum += i;}
         return sum;}

    public static int reminder(int x1 , int x2) {
        int Reminder = x1 % x2;
        
        return Reminder;
    }
    // s1 -> "abc"
    // s2 -> "def"
    // return "abcdef"
    public static String append(String s1, String s2) {
        String str =  s1.concat(s2);
        return str;

    }

    // Set the last character of the String s
    // if s length < 1, return ' ' (space character)
    public static char getLastChar(String s) {
        char last = ' ';
        if (s.length() < 1) {
            return last;}
            else { last = s.charAt(s.length() - 1);
            return last;}
        }
    // s -> "helloworld"
    // prefix -> "hello"
    // return ture
    public static boolean isStartedWith(String s, String Prefix) {
        if (s.startsWith(Prefix)) {
            return true;
        } else {
        return false;
        }
    }

    // s -> "abcbcdabc"
    // toBeRemove -> "bcd"
    // Return "abcabc"
    public static String toBeRemove(String s, String toBeRemove) {
        String[] arr = s.split(toBeRemove);
        s = "";
        for (int i = 0 ; i < arr.length ; i++) {
            s += arr [i];
        }
        return s;
        }


    }
    






    





