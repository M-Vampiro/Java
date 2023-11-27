public class Nestedloop {
    public static void main(String[] args) {
    
for (int i = 0 ; i < 5 ;  i++) { // 1 , 2 , 3 , 4 , 5
  //  System.out.println("*"); //Print and line new
  //  System.out.print(); //Print only
System.out.println("*");
}
// *****

for ( int i = 0 ; i < 5 ; i++ ) { // outer loop
System.out.println("Turn it ");

//for ( int j = 0 ; j < 4 ; j++ ) { // inter loop
    // when i = 0, j -> 0,1,2,3
    // when i = 1, j -> 0,1,2,3
    // when i = 2, j -> 0,1,2,3
    // when i = 3, j -> 0,1,2,3
    // when i = 4, j -> 0,1,2,3
  //  System.out.println("Turn it " + "UPPP !!!!!");
  //  if (i > 1) {
//     break;
   // }
}
int Factor = 10;
System.out.println("      Muitiplier Table:");
System.out.println();
for ( int v = 1 ; v < Factor + 1 ; v++ ) { 
    System.out.print(v);
    for ( int w = 2 ; w < Factor + 1 ; w++ ) {
System.out.print(" , " + w*v);
if (w > Factor) {
    break;
}
    }
    System.out.println();
    System.out.println();
}

String str = "abcdefghijklmnopqrstuvwxyz1234567890";
// variable length
    //nested loop, 4 character in a row
    //abcd
    //efgh
    //ijkl
for ( int character = 0 ; character < str.length() ; character++ ) {

    System.out.print(str.charAt(character));

    if ((character + 1) % 4 == 0) {
        System.out.println();
    }
    
}








    }
}
   










