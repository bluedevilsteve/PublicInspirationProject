import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class Z25BigDigitFibonacciNum {
  public static void findThisNum() {
    long startTime = System.nanoTime();
    Scanner size = new Scanner(System.in);
    BigInteger fnumber = BigInteger.ZERO;
    BigInteger one = BigInteger.ONE;
    BigInteger runningmate = BigInteger.ONE;
    BigInteger[] fibarray = new BigInteger[size.nextBigInteger().intValue()];
    BigInteger i = BigInteger.ZERO;
    BigInteger j = BigInteger.ZERO;
    int runningfib = 0;
      while (runningfib < 4999) {
        if (j.doubleValue() < fibarray.length) {
          runningfib = runningmate.toString().length();
        fibarray[i.intValue()] = fnumber; // sets current Fnumber to the
                                          // current
                                          // index, i
        fnumber = fnumber.add(runningmate); // sets the current fibonacci
                                            // number
                                            // to the next one in the sequence
        i = i.add(one); // index must increase each time we add in a value
        fibarray[i.intValue()] = runningmate; // sets the runningmate's
                                              // Fnumber
        System.out.println("The " + i + "'th Fibonacci number has " + runningfib + " digits!");
                                              // to
                                              // the next index in the
                                              // sequence
        runningmate = runningmate.add(fnumber);
        System.out.println(Arrays.toString(fibarray));
System.out.println();
        i = i.add(one); // index increases once every run through
        System.out.println(Arrays.toString(fibarray));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        j = j.add(one);
//        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(duration / 1000000 + " milliseconds to complete ");
        }
      }
    }
  }