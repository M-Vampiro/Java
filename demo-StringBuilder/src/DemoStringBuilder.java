public class DemoStringBuilder {
    public static void main(String[] args) {
        // String: += , concat() // pass by Value
        String x = " abc";
        x += "def";
        x = x.concat("def");
        System.out.println(x); // "abcdefdef"

        // StringBuilder // pass by referance
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def").append("def"); // no need re-assignment
        System.out.println(sb.toString()); // abcdefdef

        sb.replace(0, 3, "def");
        System.out.println(sb);

        sb.replace(0, 6, "");
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        // while loop -> counter
        // 123 456 789 101112 ...
        int counter = 4; // 123 456 789 101112
        // counter = 3; // 123 456 789

        StringBuffer s = new StringBuffer("");
        System.out.println(s.toString());
        int num = 0;
        while (counter-- > 0) {
            // s.append(++num).append(++num).append(++num);
            for (int i = 0; i < 3; i++) {
                s.append(++num);
            }
            if (counter > 0) {
                s.append(" ");
            }
        }
        System.out.println(s.toString());

        counter = 4;
        char c = (int) 97;
        StringBuffer s1 = new StringBuffer("");
        while (counter-- > 0) {
            for (int i = 0; i < 3; i++) {
                s1.append(c);
            }
            if (counter > 0) {
                c += (int) 1;
                s1.append(" ");
            }
        }
        System.out.println(s1.toString());
        System.out.println(s1.reverse().toString());
        System.out.println(s1.insert(4, "bootcamp"));
        s1.setCharAt(2, 'J');
        System.out.println(s1);
        System.out.println(s1.charAt(2));

        s1.isEmpty();
        s1.length();

        StringBuilder s3 = new StringBuilder("abc");
        StringBuilder s4 = new StringBuilder("abc");
        System.out.println(s3.toString().equals(s4.toString()));


        System.out.println(stringConcat());
        System.out.println(StringBuilderAppend());

        
        }
        public static long stringConcat() {
            long start = System.nanoTime();
            String s = "";
            for ( int i = 0 ; i < 1000 ; i++ ){
                s = s.concat("a");
            }
            long end = System.nanoTime();
            return end - start;}
        
        public static long StringBuilderAppend() {
            long start = System.nanoTime();
            StringBuilder s = new StringBuilder();
            for ( int i = 0 ; i < 1000 ; i++ ){
                s.append("a");
            }
            long end = System.nanoTime();
            return end - start;




    }
}
