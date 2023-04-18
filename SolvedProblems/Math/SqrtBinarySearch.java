package SolvedProblems.Math;

public class SqrtBinarySearch {
    public static double sqrt(int n, int p ){
        double root = 0;

        int start = 0;
        int end = n;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid > n){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        double incr = 0.01;

        for(int i = 0; i < p; i++){
            while(root*root <=n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
    public static void main(String[] args) {
        int n = 36;
        int p = 2;

        System.out.println(sqrt(n,p));
    }
}
