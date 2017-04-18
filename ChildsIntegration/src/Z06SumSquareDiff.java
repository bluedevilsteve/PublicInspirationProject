import java.util.Scanner;

// import java.math.*;

public class Z06SumSquareDiff {
   // covers PSI goal 5
   public static void FindingDiffBetweenSumsAndSquaredSums() {
      Scanner input = new Scanner(System.in);
      System.out
         .println("Enter a number N and I will compute the sum of various sums and squares of the sequence (1 to N)");
      int max = input.nextInt();
      long n = 1;
      long sumSquared = 0;
      long squareOfSum = 0;
      while (n <= max) { // PSI goal: 5
         sumSquared += n * n;
         squareOfSum += n;
         n++;

      }
      System.out.println("Add up all numbers 1 - " + max + ", we get " + squareOfSum + ". If we square that, we get: "
         + Math.pow(squareOfSum, 2) + "\n -------------------------------------------------------------------------");
      System.out
         .println("If instead we square each number from 1 - " + max + " individually, the sum is " + sumSquared);
      input.close();
   }
}

/*
 * n = 2; //sum of all the even numbers from 1 - N
 * sumSquared = 0;
 * squareOfSum = 0;
 * while (n <= max) {
 * if(n%2 == 0){// PSI goal: 5
 * sumSquared += n * n;
 * squareOfSum += n;
 * n+=2;
 * }
 */
// squareOfSum = squareOfSum * squareOfSum;
// System.out.println(squareOfSum - sumSquared);
// end of PE q6
