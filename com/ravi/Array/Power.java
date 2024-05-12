package com.ravi.Array;

import java.util.Scanner;

public class Power { // Finding power of number by RECURSION or RECURSIVE CALL
    static int powOfPq(int p , int q){
        //Base case
        if(q==0){
            return 1;
        }
        return powOfPq(p, q-1) * p; // recursive call (p,q-1) and self work *p 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for p and q :");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(p+" to the power "+q+ " is :");
        System.out.print(powOfPq(p,q));
    }
    
}
