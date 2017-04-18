import java.util.Random;
import java.util.Scanner;

public class Journals {

  public static void doingJournals() {
    // Day1DataTypes

    /*
     * int i = 4; // float is an int that has a decimal value on it double d =
     * 4.0; // double is like a float, except it is doubly // precise, and 64bit
     * String s = "HackerRank "; // String is technically not a dataType, //
     * it's a class (notice capital 'S') Scanner scan = new Scanner(System.in);
     * 
     * int newInt; // an int (integer) is just any number W/O decimals, // from
     * -2^31 to positive 2^31 double newDouble; String newString;
     * 
     * 
     * newInt = scan.nextInt(); // put in whatever integer you want newDouble =
     * scan.nextDouble(); // put in any double you want // (decimal value
     * number) scan.nextLine(); // this makes it so that pressing enter will not
     * // count as the string produced // next because that is what Java does
     * when you try going from // scanning any // number based data type to a
     * string, or vice versa e.g. // (double-->string) newString =
     * scan.nextLine();
     * 
     * System.out.println(i + newInt); System.out.println(d + newDouble);
     * System.out.println(s + newString); // end example 1
     * 
     * // oh by the way, a variable is a location in memory
     * 
     * // begin example 2 int a = scan.nextInt(); int b = scan.nextInt(); int c
     * = scan.nextInt();
     * 
     * System.out.println(a); System.out.println(b); System.out.println(c); //
     * end example 2
     * 
     * // begin example 3 scan.nextLine(); d = scan.nextDouble(); i =
     * scan.nextInt();
     * 
     * System.out.println("String: " + s); System.out.println("Double: " + d);
     * System.out.println("Int: " + i); // end example 3 scan.close();
     */
    // int name[] = new int[#];
    /*
     * YOOOOOOOOOOOOBucky's Room, Intro 2 Arrays
     * 
     * int stephen[] = new int[5]; stephen[0] = 1; stephen[1] = 2; stephen[2] =
     * 3; stephen[3] = 4; stephen[4] = 5;
     * 
     * System.out.println(stephen[4]);
     * 
     * int childs[] = { 1, 2, 3, 4, 5 }; System.out.println(childs[2]);
     */
    /*
     * YOOOOOOOOOOOOOO Bucky's Room, Creating an Array Table
     * System.out.println("IndexNumber\tValue"); //header for our table
     * 
     * int stephen[] = { 1, 1, 2, 3, 5, 8 }; for (int j = 0; j < stephen.length;
     * j++) { System.out.println(j + "\t" + stephen[j]);
     */
    /*
     * YOOOOOOOOOOOOO Bucky's Room, Summing Elements of Arrays int stephen[] = {
     * 22, 25, 18, 48, 47 }; int sum = 0; for (int j = e0; j < stephen.length;
     * j++) { sum += stephen[j]; }
     * System.out.println("Sum of the numbers input is " + sum);
     */
    /* YOOOOOOOOOOOOOOO Bucky's Room, Array Elements as Counters
    Random randnum = new Random();
    int freq[] = new int[7];
    for (int j = 0; j < 1000; j++) {
      ++freq[1 + randnum.nextInt(6)];
    }
    System.out.println("Face\tFrequency");

    for (int j = 1; j < freq.length; j++) {
      System.out.println(j + "\t" + freq[j]);
    }
     * double stephen[] = { Math.random(), Math.random(), Math.random(),
     * Math.random(), Math.random(), Math.random() }; for (int j = 0; j <
     * stephen.length; j++) { System.out.println(stephen[j] + "\t is the " + j +
     * "th index number");
     */
/*John's Lame Lectures
 * so the reason that the for loop is set up as follows:
 * for(int counter = 0; counter<array.length; counter++)
 * int counter starts at zero to represent the first element because the 
 * index numbers of the array start at zero
 * 
 * counter<array.length because again, the array length that is created when we either
 * declare it(using the int stephen[] = {x,y,z} method, or the method where we just
 * use stephen[] = new int[3]) is is more than the greatest index number
 * 
 * we use counter++ as obviously this will loop us through every element in the array
 * 
 * 
 */
  }
}