package com.Recursion;

import java.util.Scanner;

public class Recursion2 {
    static int fibonacci(int n){
        // Base case
        if(n==0 || n==1){
            return n;
        }
        //recursive call
        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);

        // self work
        int ans = prev + prevPrev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scan.nextInt();
        System.out.println(fibonacci(n));
    }
}
