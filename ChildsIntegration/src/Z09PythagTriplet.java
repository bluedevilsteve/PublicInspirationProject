
import java.util.Scanner;
import java.math.*;

public class Z09PythagTriplet {
  public static void findingPythagTriples() {
    Scanner newset = new Scanner(System.in);
    // System.out.println("Please enter three consecutive integers");
    // double sum;
    // double a = newset.nextInt();
    // double b = newset.nextInt();
    // double c = newset.nextInt();
    // a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
    // b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    // sum = a + b + c;
    int a = 0;
    int b = 1;
    double c = 2;
    int n = 1;
    do{
      // b = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
      for (int i = 0; i < 40; i++) {

        b+=n;
        a++;
        c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double product = a * b * c;
        double sum = a + b + c;
        System.out.println("\t a = " + a + "\t b = " + b + "\t c = " + c + "\t sum = " + sum
            + "\t difference in product = " + (31875000 - (int) product));
        newset.close();
      }
      n++;
    }
    while((a + b + c) < 1000);
  }
}

// while (a+b+c < 1000) {
// for (int i = 0; i < 500; i++) {
// c++;
// b = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
// a = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
//// c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
// for (int a = 3; a < 498; a++) {
// for (int b = 4; b < 499; b++) {
// for (int c = 5; c < 500; c++) {
// a = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
// b = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
// c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
// int sum = a + b + c;
// System.out.println("\ta = " + a + "\tb= " + b + "\tc= " + c + "\t sum = +
// " + sum);
// // System.out.println("\tb = "+b);
// // System.out.println("\tc = "+c);
// System.out.println(sum);
