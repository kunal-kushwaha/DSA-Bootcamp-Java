package SolvedProblems.Maths;

public class NPrimes{
    public static void printingPrime(int n, boolean[] prime){
        // We take false means prime
        for(int i = 2; i * i < n; i++){
            if(!prime[i]){
                for(int j = 0; j < n; j += i){
                    prime[j] = true;
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        // We have to print prime number from 1 to N
        int n = 40;
        boolean[] prime = new boolean[n+1];
        printingPrime(n, prime);
    }
}