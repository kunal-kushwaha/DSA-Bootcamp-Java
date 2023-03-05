public class Varags {
    public static void main(String[] args) {
        // Sum obj1 = new Sum();
        // // No matter how many arguments we pass
        // System.out.println(obj1.add(1, 1, 2, 3, 4, 7, 5, 6, 6, 4, 5, 7));

        int a = 1847013;
        
        System.out.println(String.valueOf(a).length());
    }
}

class Sum {
    // Those arguments passed will be collected here as array
    public int add(int... arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }
}