package SolvedProblems.Math;

public class SqrtNewton {
    public static double sqrt(double n){
        double x = n;
        double root;
        
        while(true){
            root = (x + (n/x)) * 0.5;

            if(Math.abs(root - x) < 0.5){
                return root;
            }

            x = root;
        }
    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }
}
