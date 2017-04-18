import java.math.*;

public class Z10SumOfPrimes {

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

// //make sure to use n_=2 so that it only checks odds,
// //remember that since it's all primes less than 2,000,000
// //we can set max at the (sqrt(2,000,000))
// // int x = 1;
// // int p = 0;
// // int sumofprimes = 0;
// // while(x<2000);
// // if(x%p == 0)
// // System.out.println(sumofprimes);
// // p++;
// // x++;
// double sum = 0;
// double n = 3;
// double i = 2;
// double max;
// // Scanner scan = new Scanner(System.in);
// while(n < max)
// while(i < Math.sqrt((double)n)){
// if(n % i == 0){
// n++;
// }
// else if(n % i != 0){
// sum += n;
// n+=2;
// break;
// }
// else{
// System.out.println(sum);
// }
// }
// }
// }