package sideWork;

import java.util.Scanner;

public class CSVstringParser {
  public static void main(String[] args) {

    {
      Scanner ask = new Scanner(System.in);
      String input = ask.nextLine();
//      String a = "31415926535897932384626433832795028841971693993751058209749445923078164"
//          + "06286208998628034825342117067982148086513282306647093844609550582231725359408128481117";
      for (int i = 0; i < input.length(); i++) {
        System.out.println(input.charAt(i) + " is the character at index number " + (i + 1));
      }
      ask.close();
    }
  }
}
