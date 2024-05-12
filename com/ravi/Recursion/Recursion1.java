package com.ravi.Recursion;

import java.util.Scanner;

public class Recursion1 { 
    static int factorial(int n){
        //Base case
        if(n==0){
            return 1;
        }
        //Recursive call
        int smallAns = factorial( n-1);
        // Big problem or Self work
        int ans = n* smallAns;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scan.nextInt();
        System.out.println(factorial(n));
        scan.close();
    }
}
