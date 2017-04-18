import java.util.Scanner;

public class JavaStdinAndStdoutTwo {

  public static void stdInAndOut() {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.nextLine();
    double d = scan.nextDouble();
    int i = scan.nextInt();
    // Write your code here.
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
    scan.close();
  }
}
