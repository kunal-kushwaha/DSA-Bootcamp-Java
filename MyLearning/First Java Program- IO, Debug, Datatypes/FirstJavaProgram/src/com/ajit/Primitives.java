package com.ajit;

public class Primitives {
    public static void main(String[] args) {
        int rollnum=45;
        char letter='e';
        float marks=64.32f;
        /*NOTE: All Decimal values by default are of the type double. To make sure they are float
         * we add the "f" at the end;
         */
        double largeDecimalNumbers=452323432.3423432;
        long largeInteger=4235452345245L;
        /*NOTE: All integer values by default are of the type "int". To make sure they are long
         * we add the "L" at the end;
         */
        boolean check= true;
        boolean check2=false;

        /*Class types of Primitives
         * a. These are also called wrapper classes. Gives an additional set of functions 
         *    we can run on the objects of these classes
        */
        Integer rno=64;
        String rno_s=rno.toString();

        // for declaring large numbers use _ instead of ,
        int a = 234_000_000;
    }

}