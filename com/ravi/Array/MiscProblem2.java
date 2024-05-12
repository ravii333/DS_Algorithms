package com.ravi.Array;
import java.util.Scanner;
public class MiscProblem2 {
    static void swapWithoutTemp(int a, int b){
        //using sum and difference only

        System.out.println("Values before Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
         a = a+b;
         b=a-b;
         a=a-b;
        System.out.println("Values after Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a  and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapWithoutTemp(a,b);
    }
}
