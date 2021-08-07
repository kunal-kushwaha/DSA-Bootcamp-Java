import java.util.Scanner;

public class FirstAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       // Factorial of a number 3! = 3x2x1
//        int fact=1;
//        int a = sc.nextInt();
//        for (int i = a; i>1; i--){
//            fact *=a;
//            a--;
//        }
//
//        System.out.println(fact);
//        // even or odd
//        int a = sc.nextInt();
//        if (a%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
//        // name as input and greet
//        String name = sc.nextLine();
//        System.out.println("Hello " +name+"!");
//        //Find Simple Interest SI = P * R *t r is in percentage
//        double p = sc.nextDouble();
//        double t = sc.nextDouble();
//        double r = sc.nextDouble();
//        r /= 100;
//        double si = p*r*t;
//        System.out.println(si);
//        // take 2 numbers and operator and calculate
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        char c = sc.next().charAt(0);
//        switch(c){
//            case '+':
//                System.out.println(a + b); break;
//            case '-':
//                System.out.println(a - b); break;
//            case '*':
//                System.out.println(a * b); break;
//            case '/':
//                System.out.println(a / b); break;
//            default:
//                System.out.println("Invalid");
//        }
//        // print largest of 2 numbers
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.println(a);
//        }
//        else{
//            System.out.println(b);
//        }
//        //all the factors of the number
//        int a = sc.nextInt();
//        for (int i=1; i<=a; i++){
//            if(a%i==0){
//                System.out.println(i);
//            }
//        }
//        //inr to dollar # 1 dollar = 74rs
//        float a = sc.nextFloat();
//        System.out.println("$"+a/74);
//        //take int value till user enters 0 and give sum of all numbers entered
//        int sum=0;
//       while(true){
//           int a = sc.nextInt();
//           if(a==0){
//               break;
//           }
//           sum = sum + a;
//       }
//        System.out.println(sum);
        // take integer till user enters 0 and print largest number
        int large=0;
       while(true){
           int a = sc.nextInt();
           if(a>large){
               large = a;
           }
           else if(a==0){
               break;
           }

       }
        System.out.println(large);

    }
}
