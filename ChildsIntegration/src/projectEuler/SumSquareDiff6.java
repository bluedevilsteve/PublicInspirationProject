package projectEuler;
//import java.math.*;

public class SumSquareDiff6 {

  public static void FindingDiffBetweenSumsAndSquaredSums() {
    int n = 1;
    int sumSquared = 0;
    int squareOfSum = 0;
    while (n <= 100) {
      sumSquared += n * n;
      squareOfSum += n;
      n++;
    }
    squareOfSum = squareOfSum * squareOfSum;

    System.out.println(squareOfSum - sumSquared);
    // end of PE q6
  }
}
