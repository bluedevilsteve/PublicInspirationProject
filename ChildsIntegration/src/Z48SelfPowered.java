import java.math.BigInteger;
import java.util.Scanner;

public class Z48SelfPowered {

  public static void summingDigitPowers() {
    long startTime = System.nanoTime();
    Scanner size = new Scanner(System.in);
    BigInteger m = BigInteger.ZERO;
    BigInteger n = BigInteger.ONE;
    BigInteger one = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    int index = size.nextInt();
    for (int i = 1; i < index; i++) {
      m = n.pow(i);
      n = n.add(one);
      sum = sum.add(m);
      System.out.println(sum.toString() + "= sum of the first " + n);
    }
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println(sum.toString() + " = the sumString  " + m.toString() + " = m and " + n.toString() + " = n");
    System.out.println(duration / 1000000 + "milliseconds ");
  }
}
