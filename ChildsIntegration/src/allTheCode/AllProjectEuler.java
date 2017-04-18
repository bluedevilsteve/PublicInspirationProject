package allTheCode;

import java.math.BigInteger;
import java.util.Scanner;

public class AllProjectEuler {
  // 1
  public static void getSumsOfFivesAndThrees() {

    // the goal of this program is to find the sum of all numbers that are
    // divisible by 3 and 5
    // and are less than 1000
    int fives = 0; // setting variable that sums numbers divisible by 5
    int threes = 0; // setting variable that sums numbers divisible by 3
    int fifteens = 0; // since every multiple of 15 counts double (%3 && %5 ==
                      // 0), we subtract this
    int sum = fives + threes;
    for (int i = 0; i < 1000; i++) {
      if (i % 5 == 0) {
        fives += i; // if number%5 == 0, add i, to the variable fives
        // if the above is the case, increment i by one and re-run check
      }
    }
    for (int n = 0; n < 1000; n++) {
      if (n % 3 == 0) {
        threes += n; // if number%3 == 0, add i, to the variable threes
        // if the above is the case, increment n by one and re-run check
      }
    }
    for (int f = 0; f < 1000; f++) {
      if (f % 15 == 0) {
        fifteens -= f;
      }
    }
    sum = threes + fives + fifteens;
    System.out.println("The answer is " + sum); // end of PE q1
  }

  // 2
  public static void addEvens() {
    /*
     * int i, n, sum, total; i = 1; n = 1; sum = 0; total = 0; while (n <
     * 4000000) { i += n; n += i; if ((i+n)% 2 == 0) { sum += i; } }
     * System.out.println(sum); } }
     */

    // AS IS, IT SKIPS OVER ADDING EVERY OTHER EVEN Fnumber TO THE TOTAL SUM,
    // 2, 8, 34, 144, 610...
    // adds 2, 34, 610,...
    // only adding every Xn and Xn+2 even Fnumbers

    int f = 0;
    int s = 1;
    int n = f + s;
    int ans = 0;
    while (n < 4000000) {
      if (f % 2 == 0) {
        ans = ans + f;
      } else if (s % 2 == 0) {
        ans = ans + s;
      }
      n = f + s;
      f = n;
      s = f + s;
    }

    System.out.println(ans);
  }

  // 6
  public static void FindingDiffBetweenSumsAndSquaredSums() {
    int n = 1;
    int sumSquared = 0;
    int squareOfSum = 0;
    while (n <= 100) {
      sumSquared += n * n;
      squareOfSum += n;
      n++;
    }
    squareOfSum = squareOfSum * squareOfSum;

    System.out.println(squareOfSum - sumSquared);
    // end of PE q6
  }

  // 7
  public static void findNthPrime() {
    int n = 3;
    int i = 2;
    int prime = 0;
    int count = 1; // starts at 1 to take into account that 2 is a prime number
    while (count <= 10000) {
      while (i <= Math.sqrt(n)) { // since a number can only be divisible by all
                                  // numbers
                                  // less than or equal to its square roots, we
                                  // only
                                  // check from i up through n's square root!
        if (n % i != 0) { // saves computation time
          i++; // if there's a remainder, increment i and check again
        } else {
          i = 3; // i doesn't need to go back to 2, because n+=2 means we'll
                 // only ever be checking odd numbers
          n += 2; // makes it so we only check odd numbers
        }
      } // if there's not a remainder before i = n (meaning all numbers from 0
        // to n were relatively prime) then move on
      i = 3; // we then re-initialize i to 3
      prime = n; // we set the current prime to what that number n was
      count++; // we increment count, meaning it was the x'th prime number
      n += 2; // we increment n by 2 so that we can check the next odd number
    } // while check that count <= 10000
    System.out.println(prime);
  }

  // 10
  public static void SummingPrimes() {

    double n = 3;
    double i = 2;
    double prime = 0;
    double sum = 0;
    if (n <= 9999) {
      while (i <= Math.sqrt(n)) { // since a number can only be divisible by all
                                  // numbers
                                  // less than or equal to its square roots, we
                                  // only
                                  // check from i up through n's square root!
        if (n % i != 0) { // saves computation time
          i += 2; // if there's a remainder, increment i and check again
        } else {
          i = 3; // i doesn't need to go back to 2, because n+=2 means we'll
                 // only ever be checking odd numbers
          n += 2; // makes it so we only check odd numbers
        }
      } // if there's not a remainder before i = n (meaning all numbers from 0
        // to n were relatively prime) then move on
      prime = n; // set the current prime to what that number n was
      sum = sum + prime;
      i = 3; // re-initialize i to 3
      n += 2; // increment n by 2 so that we can check the next odd number

    }
    System.out.println(sum + 2); // adding 2 because we skip it at beginning
  }

  // 16
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
