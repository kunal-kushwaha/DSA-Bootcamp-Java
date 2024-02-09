import java.util.*;

class TwoStacks {
  static int twoStacks(int x, int[] a, int[] b) {
    return twoStacks(x, a, b, 0, 0) - 1;
  }

  private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
    if (sum > x) {
      return count;
    }

    if (a.length == 0 || b.length == 0) {
      return count;
    }

    int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
    int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

    return Math.max(ans1, ans2);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for (int i = 0; i < t; i++) {
      int n = s.nextInt();
      int m = s.nextInt();
      int x = s.nextInt();
      int[] a = new int[n];
      int[] b = new int[m];
      for (int j = 0; j < n; j++) {
        a[j] = s.nextInt();
      }
      for (int j = 0; j < m; j++) {
        b[j] = s.nextInt();
      }
      System.out.println(twoStacks(x, a, b));
    }
  }

}
