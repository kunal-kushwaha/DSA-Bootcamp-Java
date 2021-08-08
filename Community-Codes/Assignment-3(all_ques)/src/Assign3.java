/* Cheers to the Community
BY VASU JHAWAR,
Hey there, I am learning Java by Kunal. He is an awesome mentor. Check him out on Youtube by Kunal Kushwaha
* */

import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        System.out.println("Choose your Java Programs:");
        System.out.println("""
                1. Area Of Circle Java Program
                2. Area Of Triangle
                3. Area Of Rectangle Program
                4. Area Of Isosceles Triangle
                5. Area Of Parallelogram
                6. Area Of Rhombus
                7. Area Of Equilateral Triangle
                8. Perimeter Of Circle
                9. Perimeter Of Equilateral Triangle
                10. Perimeter Of Parallelogram
                11. Perimeter Of Rectangle
                12. Perimeter Of Square
                13. Perimeter Of Rhombus
                14. Volume Of Cone Java Program
                15. Volume Of Prism
                16. Volume Of Cylinder
                18. Volume Of Prism
                20. Total Surface Area Of Cylinder
                21. Fibonacci Series In Java Programs
                
                *****************  PRESS X or x to STOP!  ***********************
                """);
        while (true) {
            System.out.println("Enter the ques number:");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            switch (n) {
                case 1, 8 -> {
                    System.out.println("Enter radius:");
                    float rc = in.nextFloat();
                    System.out.println("Area of circle = " + (3.14 * rc * rc));
                    System.out.println("Perimeter of circle = " + (2 * 3.14 * rc));
                }
                case 2 -> {
                    System.out.println("Enter base and height:");
                    float bt = in.nextFloat();
                    float ht = in.nextFloat();
                    System.out.println("Area of triangle = " + (0.5 * bt * ht));
                }
                case 3, 11 -> {
                    System.out.println("Enter length and width:");
                    float lr = in.nextFloat();
                    float wr = in.nextFloat();
                    System.out.println("Area of Rectangle= " +(lr * wr));
                    System.out.println("Perimeter of rectangle= " + (2 * (lr + wr)));
                }
                case 4 -> {
                    System.out.println("Enter the length of equal sides and base:");
                    float si = in.nextFloat();
                    float bi = in.nextFloat();
                    System.out.println("The area od isosceles triangle = " + (0.5 * Math.sqrt(Math.abs(si * si - bi * bi) / 4) * bi));
                    System.out.println("Perimeter of iso. triangle= " + ((2 * si) + bi));
                }
                case 5, 10 -> {
                    System.out.println("Enter base and height:");
                    float bp = in.nextFloat();
                    float hp = in.nextFloat();
                    System.out.println("Area Of Parallelogram= " + (bp * hp));
                    System.out.println("Perimeter of parallelogram= " + (2 * (bp + hp)));
                }
                case 6, 13 -> {
                    System.out.println("Enter the length of 2 diagonals");
                    float d1 = in.nextFloat();
                    float d2 = in.nextFloat();
                    System.out.println("Area Of Rhombus= " + (0.5 * d1 * d2));
                    ///  perimeter = 4 * sqrt(d2/2 square + d1/2 square)
                    System.out.println("Perimeter of rhombus= " + (4 * (Math.sqrt((d2 / 2 * d2 / 2) + d1 / 2 * d1 / d1))));
                }
                case 7, 9 -> {
                    System.out.println("Enter the length of side:");
                    float set = in.nextFloat();
                    System.out.println("The area of equilateral triangle= " + (set * set) * Math.sqrt(3) / 4);
                    System.out.println("The perimeter of equilateral triangle= "+(3*set));
                }
                case 12 -> {
                    System.out.println("Enter side:");
                    float ss = in.nextFloat();
                    System.out.println("Area of square= " + (ss * ss));
                }
                case 14 -> {
                    System.out.println("ENTER RADIUS AMD HEIGHT:");
                    float rcone = in.nextFloat();
                    float hcone = in.nextFloat();
                    System.out.println("Volume Of Cone= " + ((1 / 3) * 3.14 * (rcone * rcone) * hcone));
                }
                case 15, 18 -> {
                    System.out.println("Enter the base area and height:");
                    float bap = in.nextFloat();
                    float heightp = in.nextFloat();
                    System.out.println("Volume of Prism= " + bap * heightp);
                }
                case 16, 20 -> {
                    System.out.println("Enter the radius and height of cylinder:");
                    float ra = in.nextFloat();
                    float hb = in.nextFloat();
                    System.out.println("Volume of cylinder= " + (3.14 * ra * ra * hb));
                    System.out.println("TSA of cylinder= " + (2 * 3.14 * ra * (ra + hb)));
                }
                case 21 -> {
                    System.out.println("Enter the number of terms:");
                    int num = in.nextInt();
                    int n1 = 0;
                    int n2 = 1;
                    System.out.println("0 1 ");
                    for (int c = 1; c <= num; c++) {
                        int temp = n2;
                        n2 = n2 + n1;
                        System.out.print(n2 + " ");
                        n1 = temp;

                    }
                }
                default -> System.out.println("Please enter valid question number!!");
            }
            System.out.println("THANK YOU!");
            if(n=='x'|| n=='X')
            {
                break;
            }
        }
    }
}