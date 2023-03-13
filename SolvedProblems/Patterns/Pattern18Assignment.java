/*
18.   **********
      ****  ****
      ***    ***
      **      **
      *        * 
      *        *
      **      **
      ***    ***
      ****  ****
      **********
 */

public class Pattern18Assignment {
    public static void main(String[] args) {
        int n = 5, s;

        for (int i = n; i >= 1; i--, System.out.println()) {

            for (s = 1; s <= i; s++)
                System.out.print("*");
            for (s = 1; s <= 2 * (n - i); s++)
                System.out.print(" ");
            for (s = 1; s <= i; s++)
                System.out.print("*");
        }

        for (int i = 1; i <= n; i++, System.out.println()) {

            for (s = 1; s <= i; s++)
                System.out.print("*");
            for (s = 1; s <= 2 * (n - i); s++)
                System.out.print(" ");
            for (s = 1; s <= i; s++)
                System.out.print("*");

        }
    }
}
