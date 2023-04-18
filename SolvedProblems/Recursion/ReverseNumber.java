package SolvedProblems.Recursion;

public class ReverseNumber {
    public static int reverse(int n, int sum){
        if(n == 0){
            return sum;
        }

        sum = sum * 10 + (n % 10);

        return reverse(n / 10, sum);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n, 0));
    }
}
