package SolvedProblems.Recursion;

public class SumProductOfDigits {
    public static int productOfDigits(int n, int sum){
        if(n % 10 == n){
            return n;
        }

        return productOfDigits(n/10, sum) * (n % 10);
    }

    public static int sumOfDigits(int n, int sum){
        if(n == 0){
            return 0;
        }

        return sumOfDigits(n/10, sum) + (n % 10);
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println(sumOfDigits(n, 0));
        System.out.println(productOfDigits(n, 1));
    }
}
