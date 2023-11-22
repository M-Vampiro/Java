import javax.swing.event.SwingPropertyChangeSupport;

public class Demooperators {
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
     System.out.println(postIncement); //5

     int postIncement2 = b++;
     System.out.println(b); //7
     System.out.println(postIncement2); //6
    
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
// b = b + 1 //  b = 6
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
  }  else {
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
}
}
    
