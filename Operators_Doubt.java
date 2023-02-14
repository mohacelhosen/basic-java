package org.example;

public class Operators_Doubt {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        System.out.println("Integer/Integer result always (10/3) = "+(x/y)+" ( Integer) ");

        int a = 4;
        int b = 9;
        System.out.println("If numerator < denominator then reminder always (4/9) = "+(a % b)+" (numerator)");

        int m = 8;
        int n = 5;
        System.out.println("pre-increment(++m), first it will increase the value then assign/print "+(++m)+" (original m = 8)");
        System.out.println("post-increment(n++), first it will  assign/print then value will change "+(n++)+" (original n = 5)");
   
    }
}
