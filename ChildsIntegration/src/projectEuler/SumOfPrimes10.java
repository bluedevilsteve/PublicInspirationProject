package projectEuler;

import java.math.*;

public class SumOfPrimes10 {

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
}