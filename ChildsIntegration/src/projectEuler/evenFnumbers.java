package projectEuler;

public class evenFnumbers {

  public static void addEvens() {
    /*
     * int i, n, sum, total; i = 1; n = 1; sum = 0; total = 0; while (n <
     * 4000000) { i += n; n += i; if ((i+n)% 2 == 0) { sum += i; } }
     * System.out.println(sum); } }
     */

    // AS IS, IT SKIPS OVER ADDING EVERY OTHER EVEN Fnumber TO THE TOTAL SUM,
    // 2, 8, 34, 144, 610...
    // adds 2, 34, 610,...
    // only adding every Xn and Xn+2 even Fnumbers

    int f = 0;
    int s = 1;
    int n = f + s;
    int ans = 0;
    while (n < 4000000) {
      if (f % 2 == 0) {
        ans = ans + f;
      } else if (s % 2 == 0) {
        ans = ans + s;
      }
      n = f + s;
      f = n;
      s = f + s;
    }

    System.out.println(ans);
  }
}