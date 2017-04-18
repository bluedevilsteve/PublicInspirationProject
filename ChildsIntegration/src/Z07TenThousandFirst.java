public class Z07TenThousandFirst {
  public static void findNthPrime() {
    int n = 3;
    int i = 2;
    int prime = 0;
    int count = 1;                //starts at 1 to take into account that 2 is a prime number
    while (count <= 10000) {
      while (i <= Math.sqrt(n)) { // since a number can only be divisible by all numbers
                                  // less than or equal to its square roots, we only 
                                  // check from i up through n's square root!
        if (n % i != 0) {         // saves computation time
          i++;                    // if there's a remainder, increment i and check again
        } else {
          i = 3;                  // i doesn't need to go back to 2, because n+=2 means we'll
                                  // only ever be checking odd numbers
          n += 2;                 // makes it so we only check odd numbers
        }
      }                           // if there's not a remainder before i = n (meaning all numbers from 0
                                  // to n were relatively prime) then move on
      i = 3;                      // we then re-initialize i to 3
      prime = n;                  // we set the current prime to what that number n was
      count++;                    // we increment count, meaning it was the x'th prime number
      n += 2;                     // we increment n by 2 so that we can check the next odd number
    }                             //while check that count <= 10000
    System.out.println(prime);
  }
}

// second attempt works, but can be further optimized!

// int n = 3;
// int i = 2;
// int prime = 0;
// int count = 1;
// while (count <= 10000) {
// while (i < n) {
// if (n % i != 0) {
// i++; //if there's a remainder, increment i and check again
// } else {
// i = 3; //i doesn't need to go back to 2, because n+=2 means we'll only ever
// be checking odd numbers
// n += 2; //makes it so we only check odd numbers
// }
// } //if there's not a remainder before i = n (meaning all numbers from 0 to n
// were relatively prime) then move on
// i=3; //we then re-initialize i to 3
// prime = n; //we set the current prime to what that number n was
// count++; //we increment count, meaning it was the x'th prime number
// n+=2; //we increment n by 2 so that we can check the next odd number
// }
// System.out.println(prime);
// }
// }

// first

// int n = 3;
// int i = 2;
// int prime = 0;
// int count = 1;
// while (count <= 10000) {
// while (i < n) {
// if (n % i != 0) {
// i++;
// } else {
// i = 2;
// n += 2;
// }
// }
// i=2;
// prime = n;
// count++;
// n+=2;
// }
// System.out.println(prime);
// }
// }
