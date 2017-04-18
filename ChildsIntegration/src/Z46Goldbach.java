import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Z46Goldbach {
   public static void disproveHim() {
      Scanner input = new Scanner(System.in);

      System.out.println("How many odd numbers?");
      long oddnumbers = input.nextLong();

      System.out.println("How many perfect squares?");
      long perfectSquares = input.nextLong();

      System.out.println("How many primes?");
      long primeNumbers = input.nextLong();

      System.out.println("How many factorials?");
      int BigIntNumbers = input.nextInt();

      System.out.println("How many triangular numbers?");
      long triNumbers = input.nextLong();

      System.out.println("How many pentagonal numbers?");
      long pentNumbers = input.nextLong();

      System.out.println("Enter the number of integers you'd like in this array: ");
      long integerinput = input.nextLong();

      System.out.println("Ready to begin calculating? Submit any letter to continue.");
      input.next();


      long startTime = System.nanoTime();



      // ODD NUMBERS
      long[] odds = new long[(int) oddnumbers];
      int oddsLen = odds.length;
      for (int i = 0; i < odds.length; i++) {
         odds[i] = 1 + 2 * i;
      }
      System.out.println("array of the first " + oddsLen + " Odds               " + Arrays.toString(odds)+"\n");

      // PERFECT SQUARES
      long[] psquares = new long[(int) perfectSquares];
      int psquaresLen = psquares.length;
      for (int i = 0; i < psquares.length; i++) {
         psquares[i] = i * i;
      }
      System.out.println("array of the first " + psquaresLen + " Perfect Squares    " + Arrays.toString(psquares)+"\n");

      // PRIMES
      long n = 3;
      long i = 3;
      long prime = 0;
      long j = 1;
      long[] array = new long[(int) primeNumbers];
      array[0] = 2;
      int arrayLen = array.length;
      while (j < array.length) {
         while (i <= Math.sqrt(n)) { // since a number is only be divisible by
            if (n % i != 0) { // conditional operator
               i += 2;// if there's a remainder, increment i and check again
            }
            else {
               i = 3; // i doesn't need to go back to 2, because n+=2 means
                      // we'll
               n += 2; // makes it so we only check odd numbers
            }
         } // if there's not a remainder before i = sqrt(n)
         prime = n; // set the current prime to what that number n was
         array[(int) j] = prime;
         j++;
         i = 3; // re-initialize i to 3
         n += 2; // increment n by 2 so that we can check the next odd number
      }
      System.out.println("array of the first " + arrayLen + " Primes             " + Arrays.toString(array)+"\n");
      System.out.println(array[input.nextInt()]);
      System.out.println(array[input.nextInt()]);

      // FACTORIALS
      BigInteger factorial = BigInteger.ONE;
      BigInteger one = BigInteger.ONE;
      BigInteger factincrease = BigInteger.ONE;
      BigInteger[] factArray = new BigInteger[BigIntNumbers];
      int factLen = factArray.length;
      for (int k = 0; k < factArray.length; k++) {
         factArray[k] = factorial;
         factorial = factorial.multiply(factincrease);
         factincrease = factincrease.add(one);
      }
      System.out.println("array of the first " + factLen + " Factorials          " + Arrays.toString(factArray)+"\n");

      // TRIANGULAR NUMBERS
      long[] triArray = new long[(int) triNumbers];
      int triLen = triArray.length;
      for (int k = 0; k < triArray.length; k++) {
         triArray[k] = (k + k * k) / 2;
      }
      System.out.println("array of the first " + triLen + " Triangular Numbers  " + Arrays.toString(triArray)+"\n");

      // PENTAGONAL NUMBERS
      long[] pentArray = new long[(int) pentNumbers];
      int pentLen = pentArray.length;
      for (int k = 0; k < pentArray.length; k++) {
         pentArray[k] = (k + 3 * k * k) / (2);
      }
      System.out.println("array of the first " + pentLen + " Pentagonal Numbers  " + Arrays.toString(pentArray)+"\n");

      // INTEGERS
      long[] allNumbers = new long[(int) integerinput];
      int Len = allNumbers.length;
      for (int k = 0; k < allNumbers.length; k++) {
         allNumbers[k] = k;
      }
      System.out.println("array of the first " + Len + " numbers             " + Arrays.toString(allNumbers)+"\n");

      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println(duration / 1000000 + " milliseconds to complete ");
      input.close();
      System.out.println("Used Memory   :  " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1000000 + " megabytes");
      System.out.println("Free Memory   : " + Runtime.getRuntime().freeMemory()/1000000 + " megabytes");
      System.out.println("Total Memory  : " + Runtime.getRuntime().totalMemory()/1000000 + " megabytes");
      System.out.println("Max Memory    : " + Runtime.getRuntime().maxMemory()/1000000 + " megabytes \n");
      System.out.println("----------...Applying Garbage Collection...---------\n");
      System.gc();
      System.out.println("Used Memory   :  " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1000000 + " megabytes");
      System.out.println("Free Memory   : " + Runtime.getRuntime().freeMemory()/1000000 + " megabytes");
      System.out.println("Total Memory  : " + Runtime.getRuntime().totalMemory()/1000000 + " megabytes");
      System.out.println("Max Memory    : " + Runtime.getRuntime().maxMemory()/1000000 + " megabytes");

      /*
       * Scanner size = new Scanner(System.in);
       * ArrayList<Long> masterList = new ArrayList<Long>();
       * System.out.println(masterList);
       * ArrayList<String> testingList = new ArrayList<String>();
       * testingList.add((String) array.toString());
       * testingList.add((String) odds.toString());
       * testingList.add((String) triArray.toString());
       * testingList.add((String) pentArray.toString());
       * testingList.add((String) psquares.toString());
       */
   }
}
/*
 * int[] hackerrank = { 1, 17, 23, 84, 91, 224, 13, 34, 43, 2, 3345, 6,
 * 2354, 21, 223, 1, 0, 91, 8 };
 * char a = 'a';
 * char e = 'e';
 * char o = 'o';
 * char u = 'u';
 * char y = 'y';
 * String w = "www";
 */
// System.out.println(Arrays.deepToString(testingList).asArrays());
// char[] word = w.toCharArray();
// for (int jjoke = 0; jjoke < word.length; jjoke++) {
// while (word[jjoke] != word[jjoke + 1]) {
// if (word[jjoke] == a || word[jjoke] == e || word[jjoke] == i ||
// word[jjoke] == o || word[jjoke] == u
// || word[jjoke] == y) {
// if (word[jjoke + 1] != a && word[jjoke] != e && word[jjoke] != i &&
// word[jjoke] != o && word[jjoke] != u
// && word[jjoke] != y) {
// System.out.println("Yes");
// }
// }
// }
// }

// Arrays.sort(testingList.toArray());

// int[] testingItOut = new int[testingList.size()];
// // for (int k = 0; k < testingItOut.length; k++) {
// // testingItOut[k] = testingList.toString();
// // }
// for (int k = 0; k < testingItOut.length; k++) {
//
// }
// ArrayList<long>() arraylist = new ArrayList<long>(10);
//
//
//
//
// for (int k : testingList) {
// testingItOut[(int) k] = (int) k;
// }
// System.out.println(testingItOut);
//

// System.out.println(Arrays.deepToString(testingList.toArray()));

// long[] allSorted = new long[testingList.size()];
// System.out.println(Arrays.toString(allSorted));

// BIG-INTEGER CLASS, UH OH!
// testingList.add(factArray);


// new hacker rank one
/*
 * Scanner input = new Scanner(System.in);
 * StringBuilder evenSB = new StringBuilder();
 * StringBuilder oddSB = new StringBuilder();
 * int testCases = input.nextInt();
 * {
 * // String line = input.next();
 * for (int x = 0; x < testCases; x++) {
 * String line = input.next(); // + "\n";
 * for (int y = 0; y < line.length(); y += 2) {
 * evenSB.append(line.charAt(y));
 * }
 * evenSB.append(" ");
 * for (int z = 1; z < line.length(); z += 2) {
 * oddSB.append(line.charAt(z));
 * }
 * oddSB.append(" ");
 * System.out.print(evenSB + "\n" + oddSB);
 * }
 * long startTime = System.nanoTime();
 * System.out.print(evenSB + "\n" + oddSB);
 * }
 */
// new hacker rank one
/*
 * Scanner in = new Scanner(System.in);
 * int n = in.nextInt();
 * int[] grades = new int[n];
 * int[] roundGrades = new int[grades.length];
 * {
 * for (int grades_i = 0; grades_i < n; grades_i++) {
 * int q = in.nextInt();
 * grades[grades_i] = q;
 * if (q < 35) {
 * roundGrades[grades_i] = q;
 * } else if (q >= 35 && (q % 10 <= 2 || (q % 10 <= 7 && q % 10 >= 5))) {
 * roundGrades[grades_i] = q;
 * } else if (q >= 35 && (q % 10 == 3 || q % 10 == 8)) {
 * roundGrades[grades_i] = q + 2;
 * } else if (q >= 35 && (q % 10 == 4 || q % 10 == 9)) {
 * roundGrades[grades_i] = q + 1;
 * }
 * // else if(q%10 == 3){
 * // roundGrades[grades_i] = q+2;
 * // }
 * System.out.println(roundGrades[grades_i]);
 * }
 * // System.out.println(Arrays.toString(roundGrades[]));
 * }
 */