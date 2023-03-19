/*
   17.   1
        212
       32123
      4321234
       32123
        212
         1
 */
package SolvedProblems.Patterns;

public class Pattern17Assignment {
    public static void main(String[] args) {
        int n = 5;
        int times = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int count = i + 1;
            
            for (int j = 0; j < times; j++) {
                if (j < times / 2) {
                    System.out.print(count--);
                } else {
                    System.out.print(count++);
                }
            }
            times += 2;
            System.out.println();
        }

        times -= 4;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            int count = n - i - 1;

            for (int j = 0; j < times; j++) {
                if (j < times / 2) {
                    System.out.print(count--);
                } else {
                    System.out.print(count++);
                }
            }
            times -= 2;
            count--;
            System.out.println();
        }
    }
}
