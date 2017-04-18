import java.util.Scanner;

public class Day2Operators {

  public static void operators() {
    Scanner input = new Scanner(System.in);
    // double mealCost = scan.nextDouble(); // original meal price
    // int tipPercent = scan.nextInt(); // tip percentage
    // int taxPercent = scan.nextInt(); // tax percentage
    // scan.close();
    //
    // // Write your calculation code here.
    // double totalCost;
    // totalCost = mealCost;
    // totalCost += mealCost * tipPercent / 100;
    // totalCost += mealCost * taxPercent / 100;
    // // cast the result of the rounding operation to an int and save it as
    // // totalCost
    // System.out.println("The total meal cost is " + (Math.round(totalCost)) +
    // "
    // dollars.");
    // public static void main(String[] args) {
    int n = input.nextInt();
    System.out.println(n+"\n\n");
    input.close();
  }
}