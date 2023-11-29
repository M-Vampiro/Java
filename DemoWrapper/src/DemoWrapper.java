public class DemoWrapper {
    public static void main(String[] args) {
        // int -> Interget
        int i1 = 3;
        Integer i2 = 3; // 3 is int value -> autoboxing
        int i3 = i2; // auto-unbox

        Integer i4 = new Integer(5);
        Integer i5 = Integer.valueOf(3);

        int result = i4.compareTo(i2); //1
        System.out.println(result);
        int result2 = i2.compareTo(i4); // -1
        System.out.println(result2);

        if ( i2.compareTo(i4) == 0 ) { // asking if i2 == i4
            
        }

        if (i2 == i4) { // comparing the 2 int values
        
        }


        // double -> Double

        double d1 = 0.5d;
        Double d2 = 0.5d;
        Double d3 = Double.valueOf(0.5d);
        Double d4 = new Double(0.5d);
        // char -> Character
        // boolean -> Boolean

        boolean isOkay = true;
        Boolean isPassed = true; // autobox
        Boolean isPassed2 = Boolean.valueOf(true); // self box
        Boolean isPassed3 = new Boolean(true);

        // Long
        Long l1 = 10L; // 10L is long value, auto - box
        // Long - > Interger, how to fix
        // Long - > long
        // Integer -> int
        // int <-> long
        
        Integer i10 = (int) (long) l1; // int -> Integer (autobox)
        Long l2 = (long) (int) i10; // long -> Long (autobox)

        
        
        

















    }
}
