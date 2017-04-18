import java.math.*;
import java.util.Scanner;

public class Z16DigitSum {
  public static void findDigitSums() {
    // private static BigInteger BigInteger(double pow) {
    Scanner input = new Scanner(System.in);
    BigInteger sum = BigInteger.ZERO;
    BigInteger ten = BigInteger.TEN;
    System.out.println("enter a base integer");
    BigInteger base = input.nextBigInteger();
    System.out.println("enter an exponent");
    int power = input.nextInt();
    BigInteger equals = base.pow(power);
    
    double strLen = equals.toString().length();
    // double total = 0;

    for (int i = 0; i < strLen; i++) {
      sum = sum.add(equals.mod(ten));
      equals = equals.divide(ten);
      System.out.print("sum = " + sum + "..+ ");
    }
    System.out.println("\n\n = " + sum);
    // System.out.println(total);
    // code for shruggie
    System.out.println("¯" + "\\" + "_(" + 'ツ' + ")_/" + '¯');
  }
}