package com.ravi.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int last = fibonacci(n-1);
        int secLast = fibonacci(n-2);
        return last + secLast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int num = sc.nextInt();
        System.out.println("The "+num+"th Fibonacci :" +fibonacci(num));
    }
}
