public class DemoLoop2 {
    public static void main(String[] args)  {
        
        Integer[]  Integers = new Integer[]  {100, -32, 20};
        for ( Integer i : Integers) {
            System.out.println("i =" + i);

        }

        for ( int i = 0 ; i < Integers.length ; i++ ) {

            System.out.println("i =" + i);
        }

        String str = "abc,def,ijk,zxy";
        String[] parts = str.split(",");
        for ( String i : parts ) {
            System.out.println("Parts = " + i);

        Integer[] Integers2 = new Integer[] {1, 2, 3, 4, 5, 6, 7 ,8};
        for ( Integer j : Integers2 ) {
            System.out.println("num = " + j);
        }




        }











    }
}
