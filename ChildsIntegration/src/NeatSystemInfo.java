import java.util.Scanner;

public class NeatSystemInfo {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
/*      System.out.println("Type the following to execute program: ");
      System.out.println("'1' then enter followed by '1' then enter");
      int switchnum = input.nextInt();
      int casenum = input.nextInt();*/

      /*
       * try making multiple cases where the user must enter a string of Free
       * Memory, Total Memory, etc. if they want to get to that block of code.
       * Also, implement a Try-Catch statement.
       * also, find out why the values given in Eclipse do not match the values
       * given by Windows Task Manager
       */
      System.out.println("Welcome to MemoryStats! You have four choices to choose from");
      System.out.println("Enter Used Memory to view your current memory usage in MB");
      System.out.println("Enter Free Memory to view your unallocated memory in MB");
      System.out.println("Enter Total Memory to view your current max memory usage MB");
      System.out.println("Enter Max Memory to view the absolute maximum memory Eclipse can access in MB");
      System.out.println("Enter All Stats to see all of the above!");
      String caseString = input.nextLine();
      switch ("") {
         case "Used Memory":
            System.out.println("Used Memory   :  "
               + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1000000.) + " Megabytes");

            break;
         case "Free Memory":
            System.out.println("Free Memory   : " + (Runtime.getRuntime().freeMemory() / 1000000.) + " Megabytes");

            break;
         case "Total Memory":
            System.out.println("Total Memory  : " + (Runtime.getRuntime().totalMemory() / 1000000.) + " Megabytes");

            break;
         case "Max Memory":
            System.out.println("Max Memory    : " + (Runtime.getRuntime().maxMemory() / 1000000.) + " Megabytes");

            break;
         case "All Stats":
            System.out.println("Used Memory   :  "
               + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1000000.) + " Megabytes");
            System.out.println("Free Memory   : " + (Runtime.getRuntime().freeMemory() / 1000000.) + " Megabytes");
            System.out.println("Total Memory  : " + (Runtime.getRuntime().totalMemory() / 1000000.) + " Megabytes");
            System.out.println("Max Memory    : " + (Runtime.getRuntime().maxMemory() / 1000000.) + " Megabytes");

            break;

         default:
            break;
      }
      input.close();

   }
}

/*
 * System.out.print("Maximum possible memory Eclipse can use: ");
 * System.out.println((Runtime.getRuntime().maxMemory() / 1000000000f +
 * " gigabytes"));
 * System.out.print("Current total memory used: ");
 * System.out.println(
 * (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory()) /
 * 1000000000f + " gigabytes");
 * System.out.println("Submit any key to continue.");
 * input.next();
 * System.out.println("Current free memory available: ");
 * long freemem = Runtime.getRuntime().freeMemory();
 * System.out.println(Runtime.getRuntime().freeMemory() / 1000000f +
 * " megabytes");
 * System.out.println("Submit any key to continue.");
 * input.next();
 * System.out.
 * println("Now we'll see how the garbage collector performs! Press any button to continue."
 * );
 * input.next();
 * System.gc();
 * long postGCmem = Runtime.getRuntime().freeMemory();
 * System.out.print("Current free memory available: ");
 * System.out.println(Runtime.getRuntime().freeMemory() / 1000000f +
 * " megabytes");
 * System.out
 * .println("Effectiveness of garbage collector: " + (postGCmem - freemem) /
 * 1000000f + " megabytes");
 * System.out.println("Submit any key to continue.");
 * input.next();
 * System.out.println("Thanks for coming by! Press any button to exit.");
 */