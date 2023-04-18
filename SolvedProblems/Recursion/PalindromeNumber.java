package SolvedProblems.Recursion;

public class PalindromeNumber {
    static int palindrome(int n, int sum){
        if(n == 0){
            return sum;
        }
        
        sum = sum * 10 + (n % 10);

        return palindrome(n / 10, sum);
    }

    public static void main(String[] args) {
        int n = 4321234;

        if(n == palindrome(n, 0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
