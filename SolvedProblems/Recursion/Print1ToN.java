package SolvedProblems.Recursion;

public class Print1ToN {
    public static void printingNumbers(int i, int n){
        if(i == n){
            System.out.print(i + "\n");
            return;
        }
        System.out.print(i + " ");
        printingNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        printingNumbers(0 , n);
    }
}
