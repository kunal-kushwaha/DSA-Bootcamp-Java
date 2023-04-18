package SolvedProblems.Math;

public class GcdAndLcm {
    public static int lcm(int a, int b){
        int i = 1;

        while(((a * i) % b) != 0){
            i++;
        }

        return a * i;
    }

    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

        return gcd(b % a, a);
    }
    public static void main(String[] args) {
        int a = 60;
        int b = 15;
        System.out.println("LCM: " + lcm(a, b));

        // Simple formula
        // GC * LCM = a * b
    }
}
