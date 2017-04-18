import java.util.Scanner;

public class Z02EvenFnumbers {

  public static void addEvens() {
    System.out.println("This program will calculate the sum of all Fibonacci numbers less than"
        + " or equal to whatever the user inputs. Please enter a number: ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();

    int f = 0;
    int s = 1;
    int n = f + s;
    int ans = 0;

    while (n < size) {
      if (f % 2 == 0) {
        ans = ans + f;
      } else if (s % 2 == 0) {
        ans = ans + s;
      }
      n = f + s;
      System.out.print(n + " = n, ");
      f = n;
//      System.out.print(f + " = f, ");
      s = f + s;
      System.out.println(s + " = s");
    }
    System.out.println(ans);
  }
}