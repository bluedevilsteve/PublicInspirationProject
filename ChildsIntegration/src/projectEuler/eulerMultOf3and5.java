package projectEuler;
//import java.util.Scanner;

public class eulerMultOf3and5 {

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
}