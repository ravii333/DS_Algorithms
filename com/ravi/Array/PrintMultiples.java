package com.ravi.Array;

import java.util.Scanner;

public class PrintMultiples {

    static void multiples(int num, int k) {
        if (k == 0) {
            System.out.println(num);
            return;
        }
         multiples(num, k - 1);
      System.out.println(num*k);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values for num and k :");
    int num = sc.nextInt();
    int k = sc.nextInt();
    System.out.println("The "+k+ " multiples of " +num+ " are: ");
    multiples(num, k);
    sc.close();
   } 
}
