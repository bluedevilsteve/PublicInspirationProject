
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;
//
// public class Z14UPrimes{
// public static void getArrayList(){
// Scanner input = new Scanner(System.in);
// int size = input.nextInt();
// int[] array = new int[size];
// for (int o = 0; o < array.length; o++) {
// array[o] = input.nextInt();
// }
// System.out.println(Arrays.toString(array));
// ArrayList<String> plist = new ArrayList<>();
// ArrayList<String> nlist = new ArrayList<>();
// ArrayList<String> zlist = new ArrayList<>();
//
// for (int i = 0; i < array.length; i++) {
// if (array[i] > 0) {
// plist.add(Integer.toString(array[i]));
// }
// }
// System.out.println(plist + " = positives");
// for (int j = 0; j < array.length; j++) {
// if (array[j] < 0) {
// nlist.add(Integer.toString(array[j]));
// }
// }
// System.out.println(nlist + " = negatives");
// for (int k = 0; k < array.length; k++) {
// if (array[k] == 0) {
// zlist.add(Integer.toString(array[k]));
// }
// }
// System.out.println(zlist + " = zeroes");
//
// int a = array.length;
// int p = plist.size();
// int n = nlist.size();
// int z = zlist.size();
//
// System.out.println(p / a);
// System.out.println(n / a);
// System.out.println(z / a);
// System.out.println(a / a);
//
// }
// }

// String s = "public class Solution {Stack<Character> stack = new
// Stack<Character>();
// Queue<Character> queue = new LinkedList<Character>();
//
// void pushCharacter(char ch) {
// stack.push(ch);
// }
//
// void enqueueCharacter(char ch) {
// queue.add(ch);
// }
//
// char popCharacter() {
// return stack.pop();
// }
//
// char dequeueCharacter() {
// return queue.remove();
// }";
//
// }

// public static void BuildingPrimeArray() {
// Scanner input = new Scanner(System.in);
// long fact = 1;
// long digits;
// long sumOfFactorials = 0;
// long factDigit = input.nextInt();
//
// while (factDigit > 0) {
// digits = factDigit % 10;
// factDigit = factDigit / 10;
// sumOfFactorials += digits;
// for (long i = 1; i < factDigit; i++) {
// fact *= i;
// }
// System.out.println(sumOfFactorials);
//
// if (sumOfFactorials == factDigit) {
// System.out.println("hooray! " + factDigit + " is one such numberr!!! :)");
// }
// }
// }}
import java.util.Scanner;

public class Z14UPrimes {
   public static void findingPrimes() {
      Scanner input = new Scanner(System.in);
      long n = 3;
      long prime = 0;
      long i = 2;
      long testCases = input.nextLong();
      for (int j = 0; j < testCases; j++) {
         while (i <= Math.sqrt(100000)) { // since a number is only be
            // divisible
            // by
            if (n % i != 0) { // check from i up through n's square root!
               i += 2; // if there's a remainder, increment i and check again
            }
            else {
               prime = n;
               i = 3;
               System.out.println(prime);
               n += 2;
            }
         }
      }
   }
}

// Scanner input = new Scanner(System.in);
// int testCases = input.nextInt();
// long n = input.nextLong();
//// for (int i = 2; i < Math.sqrt(n); i++) {
//// if (n % i == 0) {
//// System.out.println("no no");
//// }
//// }
//// System.out.println("yes");
////
//// int odd = 3;
//// int twopow = 2;
//// while (((n / 2) % 2) != 0) {
//// odd += 2;
//// twopow *= 2;
//// }
//
// long i = 2;
// long prime = 0;
// long sum = 0;
// long j = 0;
// long[] array = new long[1000];
// long startTime = System.nanoTime();
// while (j < array.length) {
// while (i <= Math.sqrt(n)) { // since a number is only be divisible by
// // numbers
// // less than or equal to its square root, we
// // check from i up through n's square root!
// if (n % i != 0) { // saves computation time
// i += 2;// if there's a remainder, increment i and check again
// } else {
// i = 3; // i doesn't need to go back to 2, because n+=2 means we'll
// // only ever be checking odd numbers
// n += 2; // makes it so we only check odd numbers
// }
// } // if there's not a remainder before i = sqrt(n)
// prime = n; // set the current prime to what that number n was
// array[(int) j] = prime;
// j++;
// // (meaning all numbers from 0 to n were relatively prime) then move on
// sum = sum + prime;
// i = 3; // re-initialize i to 3
// n += 2; // increment n by 2 so that we can check the next odd number
// System.out.println(prime);
// System.out.println("[2 " + (Arrays.toString(array)));
// System.out.println(sum + 2); // adding 2 because we skip it at beginning
// long endTime = System.nanoTime();
// long duration = (endTime - startTime);
// System.out.println(duration / 1000000 + " milliseconds to complete ");
// }
// }
// }
