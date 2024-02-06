package DemoWhileLoop;

public class DemoWhileLoop {
  public static void main(String[] args) {





  int sum = 0;
for ( int i = 0 ; i < 5 ; i++ ) {
    sum += 1;
}
 System.out.println("Sum = " + sum);

 int j = 0;
 sum = 0;
 while (j<5) {
    sum += j++;//
 }
  System.out.println("Sum = " + sum + "j = " +j);


  // Continue, Break
  // 1 , 3 , 5 , 7 , 9
  j = 0;
  while (++j ==10)  {
  if (j == 5) break;
  if (j % 2 == 0) continue;
  }
  System.out.println(j);


  int x = 10;
  int y = 0;

  while (x > 0 && y > 0) {
    System.out.println(" x = " + x + ", y = " + y);
    y--;
    x--;
  }
    
  // 1 1 2 3 5 8 13 ... <1000



 int x1 = 0;
 int x2 = 1;
 int i = 0;
 System.out.print(x2);
  while (i < 1000) {
  i = x1 + x2;
   if (i > 1000) {
    break;
  } else {
  x1 = x2;
  x2 = i;
  System.out.print(" " + i);
 }}
 System.out.println();

 int num = 1; 
 int limit = 100;
 while (num < 3 || num > 5)
{ num ++;
System.out.println(num);}

boolean isOverLimit = false; 
int limit1 = 0;
while (!isOverLimit)
{ if (++limit1 > 100)
{
isOverLimit = true;
System.out.println("Is Over Limit = " + isOverLimit);
}
  }










  }

}
