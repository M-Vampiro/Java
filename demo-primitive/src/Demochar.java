import java.math.BigDecimal;
import java.math.BigInteger;

public class Demochar {

  public static void main (String[] args) {

    // char menas character
    char c1 = 'a';
    char c2 = 'b';
    char c3 = ' ';
    char c4 = '@';
    char c5 = '1';
//char c6 "10"; // syntax error, string -> char
//char c7 '10'; // syntax error, string -> char value should be single character
//char c8 = '' // syntax error, char has to be at least one character
  String c9 = "好";
  System.out.println(c9);
   char c10 = 1; // char -> int

   BigInteger BI = new BigInteger("99999999999999999999999999999");
   BigDecimal B0 = new BigDecimal("0.000000000000000000000000001");

   System.out.println(BI);
   System.out.println(B0);
  
  }


}