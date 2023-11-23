public class Forloop {
    public static void main(String[] args) {
    
    int x = 0;
// counter initalization ; counter's continue condition ; movement
// Step 1 : int i = 0
// Step 2 : i < 4 ??
// Step 3 : Yes -> x *= 2
// Step 4 : sysout
// Step 5 : i++
// Step 6 : i < 4 ?? i is 1
// Step 7 : Yes -> x *= 2
// Step 8 : sysout
// Step 9 : i++
// Step 10 : i < 4 ?? i is 2
// Step 11 : Yes -> x *= 2
// Step 12 : sysout
// Step 13 : i++
// Step 14 : i < 4 ?? i is 3
// Step 15 : Yes -> x *= 2
// Step 16 : sysout
// Step 17 : i++
// Step 18 : i < 4 ?? i is 4
// Step 19 : No, exit loop

// for ( int i = 0 ; i < 100 ; i++ ) { 
// x ++;
// System.out.println("x=" + x);
// }

// 0 + 1 + 2 ... + 10 -> total
 for ( int i = 0 ; i < 11 ; i++ ) {
    x += i ;
 } System.out.println("Total = " + x );

 x = 0;

// 0 + 2 + 4 + 6 + 8 + 10 = ???
 for ( int i = 0 ; i < 6 ; i++ ) {
    x += i * 2;
 } System.out.println("Total = " + x );

 x = 0;

// 0 + 3 + 6 + 9 + ... + 300 = ???
 for ( int i = 0 ; i < 101 ; i++ ) {
    x += i * 3 ;
 } System.out.println("Total = " + x );

 x = 0;

// 0 + 3 + 6 + 9 + ... + 99 = ???
 for ( int i = 0 ; i < 100 ; i++ ) {
    if (i % 3 == 0) {
    x += i ;}
 } System.out.println("Total = " + x );

 x = 0;

 for (int i = 0 ; i < 11 ; i++ ) {
    if (i % 2 == 0) {
        x += i;
    }
    
 } System.out.println(x);

 // 0 - 100
 // i) 0 - 50, odd -> sum1
 // ii) 51 - 100, odd -> sum2
 // total -> sum1 + sum2
 int total = 0;
 int sum1 = 0;
 int sum2 = 0;

 for (int i = 0 ; i < 101 ; i++ ) {
    if (i < 50 && i % 2 != 0) {
        sum1 += i;
    } else if (i > 50 && i % 2 == 0) {
        sum2 += i;
    } 
    }
    System.out.println("sum1 = " + sum1);
    System.out.println("sum2 = " + sum2);
    total = sum1 * sum2;
System.out.println("Total sum is " + total);

int sum3 = 0;
// continute
// sum up all odd number (0-100)
for (int i = 0 ; i < 101 ; i++) { // 0,1,2,3,4....
    // skip even number: continuue
    if (i % 2 == 0) {
    continue; // Go to the next iteration, skip the rest of codes
    }
    // for even number, rthe following code will be skipped
    sum3 += i;
}
    System.out.println(sum3);

total = 0;
sum1 = 0;
sum2 = 0;

 for (int i = 0 ; i < 101 ; i++) {
    if (i > 50 || i % 2 == 0) {
        continue;
    }
        sum1 += i;}
for (int i = 0 ; i < 101 ; i++) {
    if (i <= 50 || i % 2 != 0) {
        continue;
    }
        sum2 += i;
    } 
    
    System.out.println("sum1 = " + sum1);
    System.out.println("sum2 = " + sum2);
    total = sum1 * sum2;
System.out.println("Total sum is " + total);


// break -> Exit the loop directly
// sum up all odd number (0-100)
// i) sum <= 200
// The loop should be ended at which number??

int sum4 = 0;
int finalsum = 0;
for (int i = 0 ; i < 101 ; i++) {
    if ( i % 2 == 0 ) {
        continue;
    }
    sum4 += i;
    if ( sum4 > 200) {
        break;
    }
    finalsum = sum4;
}   System.out.println( "The final sum smaller than 200 is " + finalsum);

}
    }

