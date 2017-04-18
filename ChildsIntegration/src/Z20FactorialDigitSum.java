import java.math.BigInteger;
import java.util.Scanner;

public class Z20FactorialDigitSum {
  public static void addUpStuff() {
    Scanner input = new Scanner(System.in);
    BigInteger factorial = BigInteger.ONE;
    BigInteger size = input.nextBigInteger();
    BigInteger one = BigInteger.ONE;
    BigInteger ten = BigInteger.TEN;
    BigInteger i = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    while(i.doubleValue() <= size.doubleValue()){
      factorial = factorial.multiply(i);
      System.out.println(i + "! = " + factorial);
      System.out.println("-----\n");
      i = i.add(one);
      
    }
    double strLen = factorial.toString().length();
    // double total = 0;

    for (int j = 0; j < strLen; j++) {
      sum = sum.add(factorial.mod(ten));
      factorial = factorial.divide(ten);
      System.out.println("the sum of the first " + j + " digits of " + size + "! is " + sum);
      // double wow = 0;
      // wow = factorial;
      // double numdigits
      // System.out.println(numdigits);
      // for (int i = 0; i < digits.length; i++) {
      //
      // }
    }
  }
}
