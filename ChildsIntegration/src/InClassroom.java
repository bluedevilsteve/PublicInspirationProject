import java.util.Scanner; // StephenChilds, MyFirstIntegrationProject

public class InClassroom {
   // covers PSI goal 2
   public static void main(String[] args) { // this is a header
      int menuBranch;
      int hackerRankNum; // ExerciseNumber; variable is a location in
                         // memory; class is a piece of code
      int projectEulerNum; // dividing by an integer will always result in
                           // an integer

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Choose your path: 1, 2");
      System.out.println("1 for in-class exercises");
      System.out.println("2 for Project Euler programs");
      menuBranch = keyboard.nextInt();

      switch (menuBranch) {
         case 1:
            System.out.println("Typing in the number 'x'  will bring you to Hacker Rank assignment X");
            System.out.println("Currently available are Day1, Day2, 6, 7, 10, 13");
            hackerRankNum = keyboard.nextInt();

            switch (hackerRankNum) {
               case 1:
                  Journals.doingJournals();
                  break;

               case 2:
                  Day2Operators.operators();
                  break;

               case 3:
                  JavaStdinAndStdoutTwo.stdInAndOut();
                  break;

               case 4:
                  System.out.println("you've found the hidden case! it's a demonstration of integer division!!");
                  System.out.println("choose an integer number, and I will divide it by 4");
                  int q = keyboard.nextInt();
                  System.out.println(q / 4); // demonstration of integer
                                             // division
                  break;

               case 6:
                  // HackerRank.getMilitaryTime();
                  break;

               case 7:
                  HackerRank.findDataType();
                  break;
               case 8:
                  ABlankOne.doingAblankone();
                  break;

               default:
                  System.out.println("You entered an invalid number, please try again (or don't)");
            }
         case 2:
            System.out.println("Typing in the number 'x'  will bring you to my answer to ProjectEuler Question X");
            System.out.println("Currently available are 1, 2, 5, 6, 7, 10, 13, 14, 16, 20, 25, 48");
            projectEulerNum = keyboard.nextInt();

            switch (projectEulerNum) {
               case 1: // What is the sum of all multiples of 3 or 5, less than
                       // 1,000
                  Z01EulerMult3sand5s.getSumsOfFivesAndThrees(); // this is a
                                                                 // call, and
                  break; // this is an argument

               case 2: // even Fibonacci numbers
                  Z02EvenFnumbers.addEvens();
                  break;

               case 5: // project euler question 5
                  System.out.println("I actually did this question out by hand, so there's nothing here!");
                  break;

               case 6: // calculates (a + b + c+...+z)^2 - (a^2 + b^2 + c^2
                       // +...+z^2)
                  Z06SumSquareDiff.FindingDiffBetweenSumsAndSquaredSums();
                  break;

               case 7: // what is the 10,001st prime number
                  Z07TenThousandFirst.findNthPrime(); // PSI2 goal: 3
                                                      // identification method
                                                      // call +
                                                      // header
                  break;

               case 9:
                  Z09PythagTriplet.findingPythagTriples();
                  break;

               case 10:
                  Z10SumOfPrimes.SummingPrimes();
                  break;

               case 13:
                  Z13LargeSum.sumBigNumbers();
                  break;

               case 14:
                  Z14UPrimes.findingPrimes();
                  break;

               case 16:
                  Z16DigitSum.findDigitSums();
                  break;
               //
               case 20:
                  Z20FactorialDigitSum.addUpStuff();
                  break;

               case 25:
                  Z25BigDigitFibonacciNum.findThisNum();
                  break;
               case 46:
                  Z46Goldbach.disproveHim();
                  break;
               case 48:
                  Z48SelfPowered.summingDigitPowers();
                  break;

               // case 22:
               // SieveOfEratosthenes.primes();
               // break;

               default:
                  System.out.println("You entered an invalid number; please try again(or don't)");

            }
         case 3:
            PlaceHolder.holdingPlaces();
            /*
             * System.out.println("Why did you type in 3?"); System.out.
             * println("I told you there was nothing under three...well let's do something I guess..."
             * ); System.out.
             * println("Type in a number, 1-10, and I will attempt to guess it (if I guess right, I get an A)"
             * ); answer = keyboard.nextInt();
             * System.out.println("My guess is....hmm....let me think...." +
             * answer
             * + "!");
             */

            break;

         default:
            System.out.println("you entered an invalid number, have a nice day!");
            keyboard.close();

      }
   }
}
