package SolvedProblems.BitManipulation;

public class PowerOfNum {
    public static int findingPower(int base, int power) {
        int result = 1;
        while(power > 0){
            if((power & 1) == 1){
                result = result * base;
            }
            base = base * base;
            power >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        // find a power b
        System.out.println(findingPower(a, b));
    }
}
