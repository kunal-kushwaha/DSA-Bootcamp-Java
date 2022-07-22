package Intermediate;

import java.util.Scanner;

// Find Ncr & Npr
public class Ques15 {
    public static void main(String[] args) {
        /*
        Ncr = Combination: is the process of selection of members from any particular set.
        For example, if we had to select 2 members at random from set A with members 1, 2 & 3, we’d have 3 possibilities namely {1,2}, {2,3} and {1,3}.
        Formula = (n)!/(r!) x (n-r)!

        Npr = Permutation: is the process of arrangement of all the members in any set into a particular sequence or order.
        For example, set A with members 1 & 2 can be arranged into 2 ways such as {1,2,} and {2,1}.
        Formula = (n)!/(n-r)!
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();

        if(n>=r) {
            System.out.println("The value of "+n+"p"+r+" is : "+permutation(n, r));
            System.out.println("The value of "+n+"c"+r+" is : "+combination(n, r));
        }
        else
            System.out.println("n value should be greater than or equals to r value");
    }

    static double factorialOfN(int n){
        int i =1;
        double factorial = 1;
        while (i<=n){
            factorial*=i;
            i++;
        }
        return factorial;
    }

    static double permutation(int n, int r){
        double permutation = factorialOfN(n)/factorialOfN(n-r);
        return permutation;
    }

    static double combination(int n, int r){
        double combination = factorialOfN(n)/(factorialOfN(n-r)*factorialOfN(r));
        return combination;
    }
}
