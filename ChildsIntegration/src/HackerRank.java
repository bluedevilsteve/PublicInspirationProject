import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {

   public static void insertionSort(int[] A) {
      /*
       * for (int i = 1; i < A.length; i++) { int value = A[i]; int j = i - 1;
       * while (j > 0 && A[j] > value) { A[j + 1] = A[j]; j = j - 1; } A[j + 1]
       * = value; }
       * printArray(A); }
       * static void printArray(int[] ar) { for (int n : ar) {
       * System.out.print(n + " "); } }
       */

      // public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringBuilder evens = new StringBuilder();
      StringBuilder odds = new StringBuilder();
      int testCases = input.nextInt();

      // String line = input.next();
      for (int k = 0; k < testCases; k++) {
         String line = input.next() + "\n";
         for (int j = 0; j < line.length(); j += 2) {
            evens.append(line.charAt(j));
         }
         for (int i = 1; i < line.length(); i += 2) {
            odds.append(line.charAt(i));
         }
         // System.out.println(evens + " " + odds);
         // line = input.next();
      }
      System.out.print(evens + " " + odds);

   }

   /*
    * Scanner in = new Scanner(System.in); int n = in.nextInt(); int[] ar = new
    * int[n];for( int i = 0;i<n;i++) { ar[i] = in.nextInt(); }
    * void insertionSort(ar); }
    */
   public static void findDataType() {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
         a[i] = in.nextInt();
      }
      Arrays.sort(a);
      ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
      for (int j = 0; j < a.length; j++) {
         arrayList.add(a[j]);
      }
      System.out.println("Prior to alteration : " + arrayList);
      int count = 1;
      while (arrayList.size() > 1) {
         if (arrayList.get(0) == arrayList.get(1)) {
            arrayList.remove(0);
            arrayList.remove(0);
            System.out.println("After removal iteration #" + count + ": " + arrayList);
            count++;
         }
         else {
            System.out.println(arrayList.get(0));
            break;
         }
      }
      System.out.println(arrayList.get(0));
   }
}

/*
 * Scanner sc = new Scanner(System.in); int t = sc.nextInt();
 * for (int i = 0; i < t; i++) {
 * try { long x = sc.nextLong();
 * System.out.println(x + " can be fitted in:");
 * if (x >= -128 && x <= 127) { System.out.println("* byte");
 * System.out.println("* short"); System.out.println("* int");
 * System.out.println("* long"); } else if (x >= -32768 && x <= 32767) {
 * System.out.println("* short"); System.out.println("* int");
 * System.out.println("* long"); } else if (x >= -2147483648 && x <= 2147483647)
 * { System.out.println("* int"); System.out.println("* long"); } else if (x <
 * -2147483648 || x > 2147483647 ) { System.out.println("* long"); // Complete
 * the code } } catch (Exception e) { System.out.println(sc.next() +
 * " can't be fitted anywhere."); } } } }
 */

// Write your code here
// class Calculator {
// public int power(int n, int p) {
// Scanner input = new Scanner(System.in);
// int size = input.nextInt();
// for (int i = 0; i < size; i++) {
// n = input.nextInt();
// p = input.nextInt();
// try {
// if (n < 0 || p < 0) {
// System.out.println(Math.pow(n, p));
//
// }
// } catch (Exception e) {
// System.out.println("n and p should be non-negative");
// return n;
// }
// }
// }
// }

// class MyCalculator {
// public int power(int n, int p) throws Exception {
// if (n < 0 || p < 0) {
//
// throw new Exception("n and p should be non-negative");
// } else {
// return ((int) Math.pow(n, p));
// }
// }
// }
// public static int convertToFromBinary(){
//
// Scanner input = new Scanner(System.in);
// int x = input.nextInt();
// int fact = 1;
// int something;
// int sumOfFactorials = 0;
// int number1 = input.nextInt();
// while (number1 > 0) {
// something = number1 % 10;
// number1 = number1 / 10;
// int someOfFactorials = something;
// if(fact == someOfFactorials)
// System.out.println(fact);
// for (int i = 1; i < x; i++) {
// fact *= i;
// }
//
// }

// try {
//
// } catch (InputMismatchException e) {
// System.out.println("java.util.InputMismatchException"); // TODO: handle
// exception
// }
// catch (ArithmeticException e) {
// System.out.println("java.util.ArithmeticException / by zero"); // TODO:
// handle exception
// }
// print.sta

// Scanner input = new Scanner(System.in);
// int numerator = input.nextInt();
// int denominator = input.nextInt();
// try {
// System.out.println(numerator / denominator);
// } catch (InputMismatchException e) {
// System.out.println("java.util.InputMismatchException");
// } catch (ArithmeticException e) {
// System.out.println("java.lang.ArithmeticException: / by zero");
// } catch (NullPointerException e) {
// System.out.println(e);// TODO: handle exception
// } catch (Exception e) {
// e.printStackTrace();
// }
//

// string number = "xyz"100 x+10 y+
// z
// xyz%100=
// x
// xyz%10*-1+xyz%100=
// y
// xyz%10*-1+xyz%100*-1=y]]
//
// xyz/100=
// x
// xyz/10=
// xy
// xy%10=
// y
// xyz%10=
// z
//
// x!+y!+z!=
// xyz
// x!+y!+z!=100 x+10 y+z 947 sum=7 num=94
//
// 94 sum=4 num=9
//
// 9 sum=9 num=0

/*
 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
 * class should be named Solution.
 */

/*
 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
 * class should be named Solution.
 */

// private static Object factorial() {
// // TODO Auto-generated method stub
// return null;
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int decNum = input.nextInt();
// int remainder = 0;
// int seqLen = 0;
// int total = 0;
//
// while (decNum > 0) {
// remainder = decNum % 2;
// decNum = decNum / 2;
// if (remainder == 1) {
// seqLen++; //this means if the decimalNumber is not divisible by two, then
// the
// sequence
// if (seqLen > total) {
//
// total = seqLen; //this is to set the total to the sequenceLength which is
// the
// longest amount of 1's so far
//
// } else {
//
// seqLen = 0;
// }
// }
//
// }
// System.out.println(total);
//
// }
// }
//
//
// //this was essentially copy-and-pasted from the discussion forums, but i
// am
// only now submitting this because I truly understand the code and what is
// going on. I cannot believe how ingenious this solution is:
//
// //basically, we take advantage of the fact that if a number is converted
// from
// decimal to binary, we can use a little trick to find the binary
// number...we
// just find the number of digits (1's or 0's) by dividing the decimal
// number
// by
// 2, until we arrive at either 0
// //for example, 127/2 = 63 + 1
// //so seqLen = 1, and total = 1
// // 63/2 = 31 + 1
// //so seqLen = 2 now, and total = 2
// //31/2 = 15 + 1...sL=3, tot=3
// //etc.15...sL=4, tot=4
// //etc.7...sL=5, tot=5
// //etc.3...sL=6, tot=6
// //etc.1...sL=7, tot=7
// //0...sL=7, tot=7
//
// //this is true because 127 in binary is 1111111 or 7 1's
//
// //where this would be interesting is a number like 123, which would go
// through the following sequence of iterations:
// //for example, 123/2 = 61 + 1
// //so seqLen = 1, and total = 1
// // 61/2 = 30 + 1
// //so seqLen = 2 now, and total = 2
// //30/2 = 15!!!
// //so now we re-initialize seqLen back to 0, but total stays at 2
// //15/2 = 7 + 1
// //so seqLen = 1 now, total still is at 2 because total < seqLen
// //7/2 = 3 + 1, seqLen = 2, total = 2
// //3/2 = 1 + 1, seqLen = 3, total = 3!!
// //1/2 = 0 + 1, seqLen = 4, total = 4
// //0...sL = 4, tot=4
//
// //this also holds true since 123 in binary is 1111011

// Scanner input = new Scanner(System.in);
// int decNum = input.nextInt();
// int remainder = 0;
// int s = 0;
// int t = 0;
//
// while (decNum > 0) {
// remainder = decNum % 2;
// decNum = decNum / 2;
// if (remainder == 1) {
// s++;
// if (s >= t) {
//
// t = s;
//
// } else {
//
// s = 0;
// }
// }
//
// System.out.println(t);
// }
// }
// }

// public static void main(String[] args) {
// if(1 == 1){
// Scanner sc = new Scanner(System.in);
// String A = sc.next();
// String B = sc.next();
// int alen = A.length();
// int blen = B.length();
//
// System.out.println(alen + blen);
//
// char oha = A.charAt(0);
// char ohb = B.charAt(0);
// char C = Character.toTitleCase(oha);
// char D = Character.toTitleCase(ohb);
//
//
// String A1 = A.replace(oha, C);
// String B1 = B.replace(ohb, D);
//
// System.out.println();
// A.com
//
//
// }
// if (A.compareTo(B) < 0) {
// A = A.concat(" " + B);
// System.out.println("No");
// System.out.println(A);
// } else {
// B = B.concat(" " + A);
// System.out.println("Yes");
// System.out.println(B);
// }
// /* Enter your code here. Print output to STDOUT. */
//
// }

// import java.io.*;
// import java.text.SimpleDateFormat;
// import java.util.*;
//
// import sun.applet.Main;
// public class HackerRank {
//
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
//
// public class Solution {
//
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// String S = in.next();
// try {
// int v = Integer.parseInt(S);
// System.out.println(v);
// } catch (Exception e) {
// System.out.println("Bad String");// TODO: handle exception
// }
//
// }

// public static void findingSubstrings() {
// Scanner input = new Scanner(System.in);
// int x = input.nextInt();
// String[] array = {input.nextLine()};
// for (int i = 0; i < x; i++) {
// if (i % 2 != 0) {
// // code;
//
// System.out.println(array[i]);
// } else {
// // code;
// System.out.println(array[i]);
// }
// }
// }

// public static void getMilitaryTime() {
//
// Scanner s = new Scanner(System.in);
// System.out.println("Enter a time ([h]h:mm [am|pm]):");
// String input = s.nextLine();
// String x = input;
// if (input.charAt(input.length() - 1) == 'm')
// x = input.substring(0, 2);
// int TwentyFour = +12;
// System.out.println(TwentyFour);

// }
// String input = ""
// if string has pm, remove pm, add 12 to hh
// else if string has am, remove am
// if (input.toLowerCase().contains("pm")) {
// String military = input;
// military = input.substring(input.indexOf("PM") - 8, input.indexOf("PM"));
// if (military.substring(0, 2).equals("01")) {
// military = military.replace("01", "13");
// } else if (military.substring(0, 2).equals("02")) {
// military = military.replace("02", "14");
// } else if (military.substring(0, 2).equals("03")) {
// military = military.replace("03", "15");
// } else if (military.substring(0, 2).equals("04")) {
// military = military.replace("04", "16");
// } else if (military.substring(0, 2).equals("05")) {
// military = military.replace("05", "17");
// } else if (military.substring(0, 2).equals("06")) {
// military = military.replace("06", "18");
// } else if (military.substring(0, 2).equals("07")) {
// military = military.replace("07", "19");
// } else if (military.substring(0, 2).equals("08")) {
// military = military.replace("08", "20");
// } else if (military.substring(0, 2).equals("09")) {
// military = military.replace("09", "21");
// } else if (military.substring(0, 2).equals("10")) {
// military = military.replace("10", "22");
// } else if (military.substring(0, 2).equals("11")) {
// military = military.replace("11", "23");
// }
// System.out.println(military);
//
// } else if (input.toLowerCase().contains("am") == true) {
// String military = input.substring(0, input.indexOf("AM"));
// if(military.substring(0, 2).equals("12")){
// military = military.replace("12", "00");
// }
// military.replace("am", "");
// System.out.println(military);
//
// }
/*
 * public static void convertToFromBinary() {
 * Scanner number = new Scanner(System.in);
 * System.out.println(Integer.toBinaryString(number.nextInt())); //search all
 * substrings starting with a 1...until a zero shows up, increment a counter,
 * Scanner scanner = new Scanner(System.in; int x1 = 0; boolean goodinput =
 * false; TRY CATCH SHIT while (goodinput == false){
 * System.out.println("Enter first number"); try{ x1 = scanner.nextInt();
 * goodinput = true; } catch (InputMismatchException ex){
 * System.out.println("Requires an integer"); scanner.nextLine(); }
 * int xact, yact, zact; xact = (int) (100 * (Math.random()) / 10); yact = (int)
 * (100 * (Math.random()) / 10); zact = (int) (100 * (Math.random()) / 10);
 * System.out.println(xact + "\n" + yact + "\n" + zact); String s =
 * "them radicalisms"; System.out.println(s); } }
 */