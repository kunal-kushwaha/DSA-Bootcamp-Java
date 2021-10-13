package com.conditionals_loops_2;

//import com.company.Main;

import java.awt.*;
import java.awt.geom.Area;
import java.math.MathContext;
import java.util.Scanner;

public class conditionals_and_loops{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1. Area Of Circle Java Program
        int radius = 25;
        System.out.println("Area Of Circle = "+ 2*Math.PI*radius);

//        2. Area Of Triangle
        long base = 654L;
        long height = 654L;
        System.out.println("Area Of Triangle = "+base*height*0.5);

//        3. Area Of Rectangle
        float length = 15.5F;
        float breadth = 6.9F;
        System.out.println("Area Of Rectangle = "+length*breadth);

//        4. Area Of Isosceles Triangle
        int side = 15; // all side are same in isosceles triangle
        System.out.println("Area Of Isosceles Triangle = "+0.5*side*side);

        //5. Area Of Parallelogram
        System.out.println("Area Of Parallelogram = "+base*height+" cm2");

//        6. Area Of Rhombus
        int diagonal_1 = 23;
        int diagonal_2 = 41;
        System.out.println("Area Of Rhombus = "+(diagonal_1*diagonal_2)/2);


//        7. Area Of Equilateral Triangle
    // all sides are same in isotopes triangle
        System.out.println("Area Of Equilateral = "+side*side*Math.sqrt(3)/4);


//        8. Perimeter Of Circle
        System.out.println("Perimeter Of Circle = "+2*Math.PI*radius);

//        9. Perimeter Of Equilateral Triangle
        System.out.println("Perimeter Of Equilateral Triangle = "+3*side);

//        10. Perimeter Of Parallelogram
        System.out.println("Perimeter Of Parallelogram ="+(length*breadth)*2);

//        11. Perimeter Of Rectangle
        int width =16;
        System.out.println("Perimeter Of Rectangle = "+(length+width)*2);

//        12. Perimeter Of Square
        System.out.println("Perimeter Of Square = "+4*side);

//        13. Perimeter Of Rhombus
        System.out.println("Perimeter Of Rhombus = "+4*side);

//        14. Volume Of Cone Java Program
        System.out.println("Volume Of Cone = "+(Math.PI*radius*radius*height)/3);

//        15. Volume Of Prism
        int volume = (int) (length*breadth*height);
        System.out.println("Volume Of Prism = "+volume*base);

//        16. Volume Of Cylinder
        System.out.println("Volume Of Cylinder = "+ Math.PI*radius*radius*height);

//        17. Volume Of Sphere
        System.out.println("Volume Of Sphere = "+ (Math.PI*radius*radius*4)/3);

//        18. Volume Of Pyramid
        int base_length = 18;
        int base_width = 15;
        int pyramid_height = 16;
        System.out.println("Volume Of Pyramid  = "+ base_length*base_width*pyramid_height);

//        19. Curved Surface Area Of Cylinder
        System.out.println(" Curved Surface Area Of Cylinder = "+ 2*Math.PI*radius*height);

//        20. Total Surface Area Of Cube
        System.out.println(" Total Surface Area Of Cube = "+6*length*length); // Formula = 6a2

//        21. Fibonacci Series In Java Programs
        System.out.print("Enter number for Fibonacci ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++){

            System.out.print(i +" ");
        }

















    }
}
