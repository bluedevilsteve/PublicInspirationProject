import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class DiceRoll {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("How many times would you like to roll the dice?");
      int numRolls = input.nextInt();
      System.out.println("How many times would you like to repeat the experiment?");
      int testCases = input.nextInt();
      double averageTime = 0;
      double a = 0;
      double b = 0;
      int kounter = 0;
      double sum = 0;
      long two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0,
         twelve = 0;
      long[] sumArray = { two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
      while (kounter < numRolls) {
         double startTime = System.nanoTime();

         for (int i = 0; i < testCases; i++) {
            a = 1 + (6 * Math.random());
            b = 1 + (6 * Math.random());
            // c = 1 + (int) (6 * Math.random());
            sum = a + b;
            // System.out.println("(" + a + "," + b + ")..." + sum);

            if (sum == 2) {
               two++;
               sumArray[0] = two;
            }
            else if (sum == 3) {
               three++;
               sumArray[1] = three;
            }
            else if (sum == 4) {
               four++;
               sumArray[2] = four;
            }
            else if (sum == 5) {
               five++;
               sumArray[3] = five;
            }
            else if (sum == 6) {
               six++;
               sumArray[4] = six;
            }
            else if (sum == 7) {
               seven++;
               sumArray[5] = seven;
            }
            else if (sum == 8) {
               eight++;
               sumArray[6] = eight;
            }
            else if (sum == 9) {
               nine++;
               sumArray[7] = nine;
            }
            else if (sum == 10) {
               ten++;
               sumArray[8] = ten;
            }
            else if (sum == 11) {
               eleven++;
               sumArray[9] = eleven;
            }
            else {
               twelve++;
               sumArray[10] = twelve;
            }
         }

         double endTime = System.nanoTime(); // end time is here; we're through
                                             // one more iteration numOfRuns
         double runTime = ((endTime - startTime) / 1000000); // finds the run
                                                             // time in
                                                             // milliseconds
         averageTime += runTime; // averageTime is currently totally time but we
                                 // divide by numOfRuns later
         kounter++;
      }
      System.out
         .println("\nTotal # of appearances over all " + numRolls + " testcases " + Arrays.toString(sumArray) + "\n");
      // for (long x : sumArray) {
      // aveArray[g] = x/numRolls;
      // g++;
      // }
      double[] expArray = { (100 / 36), (200 / 36), (300 / 36), (400 / 36), (500 / 36), (600 / 36), (500 / 36),
            (400 / 36), (300 / 36), (200 / 36), (100 / 36) };
      double[] accuracy = new double[expArray.length];
      int g = 0;
      for (double l : expArray) {
         expArray[g] = (expArray[g] * numRolls * testCases) / 100f;
         g++;
      }
      System.out.println(
         "Expected # appearances over " + testCases * numRolls + " testcases " + Arrays.toString(expArray) + "\n");
      int c = 0;
      for (double g1 : expArray) {
         accuracy[c] = (100f * (expArray[c]) / (sumArray[c]));
         c++;
      }
      System.out.println("Accuracy as a percentage (assuming code is right): " + Arrays.toString(accuracy));
      sumArray[0] /= kounter;
      sumArray[1] /= kounter;
      sumArray[2] /= kounter;
      sumArray[3] /= kounter;
      sumArray[4] /= kounter;
      sumArray[5] /= kounter;
      sumArray[6] /= kounter;
      sumArray[7] /= kounter;
      sumArray[8] /= kounter;
      sumArray[9] /= kounter;
      sumArray[10] /= kounter;
      System.out.println("total run time: " + averageTime + " ms");
      System.out.println("number of experiments: " + testCases);
      System.out.println("average time per roll: " + (averageTime / numRolls) + " ms");
      input.close();
   }
}

/*
 * System.out.println("Run Time: "+runTime/kounter+" ms");sumArray[11]/=kounter;
 * for(
 * double i = 0;i<expectArray.length;i++)
 * {
 * expectArray[j] = ((double) sumArray[j]);
 * j++;
 * }System.out.println("Expected ratio is "+Arrays.toString(expectArray));
 * averageTime=averageTime/numOfRuns;
 * int j = 0;
 * double[] expectArray = new double[sumArray.length];for(
 * int j = 0;j<sumArray.length;j++)
 * {
 * expectArray[j] = ((sumArray[j] + 1) / testCases);
 * }
 * Scanner input = new Scanner(System.in);
 * int testCases = input.nextInt();
 * int a = 0;
 * int b = 0;
 * int sum = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8
 * = 0, sum9 = 0, sum10 = 0, sum11 = 0,
 * sum12 = 0;
 * int[] sumArray = { sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10,
 * sum11, sum12 };
 * for(
 * int i = 0;i<testCases;i++)
 * {
 * a = (int) (6 * Math.random());
 * b = (int) (6 * Math.random());
 * sum = a + b;
 * System.out.println("(a,b) = (" + a + "," + b + ") and their sum is " + sum);
 * }
 * if(sum==2)
 * {
 * sum2++;
 * }else if(sum==3)
 * {
 * sum3++;
 * }else if(sum==4)
 * {
 * sum4++;
 * }else if(sum==5)
 * {
 * sum5++;
 * }else if(sum==6)
 * {
 * sum6++;
 * }else if(sum==7)
 * {
 * sum7++;
 * }else if(sum==8)
 * {
 * sum8++;
 * }else if(sum==9)
 * {
 * sum9++;
 * }else if(sum==10)
 * {
 * sum10++;
 * }else if(sum==11)
 * {
 * sum11++;
 * }else
 * {
 * sum12++;
 * }System.out.println(Arrays.toString(sumArray));
 * }}
 */

/*
 * import java.io.*;
 * import java.util.*;
 * import java.text.*;
 * import java.math.*;
 * import java.util.regex.*;
 * public class Solution {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * int n = 3;
 * int i = 2;
 * int prime = 0;
 * int testCases = input.nextInt();
 * int whichPrime = input.nextInt();
 * // answer[0] = 2;
 * //ArrayList<Integer> numbers = new ArrayList<Integer>();
 * for(int q = 0; q < testCases;q++){
 * for(int j = 1; j < whichPrime+1; j++) {
 * while (i <= Math.sqrt(n)) { // since a number is only be divisible by
 * if (n % i != 0) { // saves computation time
 * i += 2;// if there's a remainder, increment i and check again
 * } else {
 * i = 3; // i doesn't need to go back to 2, because n+=2 means we'll
 * n += 2; // makes it so we only check odd numbers
 * }
 * } // if there's not a remainder before i = sqrt(n)
 * prime = n; // set the current prime to what that number n was
 * n += 2;
 * System.out.println(prime);
 * i = 3;
 * }
 * }
 * }
 * }
 */ 

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = 2;
      int i = 1;
      int prime = 0;
      int q = 0;
      int testCases = input.nextInt();
      // answer[0] = 2;
      while (q < testCases) {
         int howMany = input.nextInt();
         int[] primes = new int[howMany];
         for (int z = 0; z < primes.length - 1; z++) {
            for (int j = 2; j < whichPrime; j++) {
               while (i <= Math.sqrt(n)) { // since a number is only be
                                           // divisible
                                           // by
                  if (n % i != 0) { // saves computation time
                     i++;// if there's a remainder, increment i and check again
                  }
                  else {
                     i = 2; // i doesn't need to go back to 2, because n+=2
                            // means
                            // we'll
                     n++; // makes it so we only check odd numbers
                  }
               } // if there's not a remainder before i = sqrt(n)
               prime = n; // set the current prime to what that number n was
               n++;
               i = 1;
               primes[z] = prime;
               System.out.println(Arrays.toString(primes));
            }
            System.out.println((q + 1) + "th iteration's " + prime + "----");
            primes[z] = prime;
         }
         q++;
      }
   }
}*/