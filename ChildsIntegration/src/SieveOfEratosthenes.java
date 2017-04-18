import java.util.Scanner;

public class SieveOfEratosthenes {

   public void primes(int n) {
  
     boolean[] primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;       
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
           }
       }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               System.out.println(i);
           }
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = scanner.nextInt();
       double startTime = System.nanoTime();
       SieveOfEratosthenes sieve = new SieveOfEratosthenes();
       sieve.primes(n);
       double endTime = System.nanoTime();
       System.out.println((endTime - startTime) / 1000000 + " milliseconds to complete ");
   }

}
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SieveOfEratosthenes {
//  public static void findThisNum() {
//    long startTime = System.nanoTime();
//    Scanner size = new Scanner(System.in);
//
//    long prime = 3;
//    long multiple = 1;
//    long max;
//    max = size.nextLong();
//    long[] all = new long[(int) max];
//    int j = 0;
//    int k = all.length;
//    for (int i = 0; i < all.length; i++) {
//      all[i] = i;
//    }
//    long[][] array = new long[(int) all.length][(int) all.length];
//    while (j < array.length) {
//      long[][] array2 = new long[all.length][array.length + 1];
//      System.arraycopy(array, 0, array2, 0, array.length);
//      array2[array.length] = all;
//      j++;
//      k--;
//      System.out.println(array2);
//    }
//    System.out.println(array);
//    System.out.println(all);
//    // for (int j = 0; j < array.length; j++) {
//    // prime = multiple*prime;
//    // array[j][] = [prime];
//    // multiple++;
//    // while (multiple * prime <= max && prime % 5 != 0) {
//    // for (int j = 0; j < max; j = (int) (multiple * prime)) {
//    // multiple++;
//    // }
//    // }
//
//    long endTime = System.nanoTime();
//    long duration = (endTime - startTime);
//    System.out.println(duration / 1000000 + " milliseconds to complete ");
//  }
//
//  // asically for loop over all numbers such that max divided by prime is > 0;
//  // this will be how far to check off all the numbers non primality
//
//  // maybe some nested for loops where each time we have an array of size max,
//  // we use a for loop to cancel out each value up to that max value so long
//  // as
//  // it is a multiple of whatever base prime we're checking
//
//  // then on the inner for loop we remove we ask i to not
//  // actually use a while loop which relates to something along the lines of
//
//  // may have to read up on stacks first and ArrayLists, as well as pushing
//  // and popping elemenets in and out in and out of the Array.classa rush
//  // limbaugh looking fooll, actually, everyone was being completely serious.
//}