package com.ravi.Recursion;

import java.util.Scanner;

public class ArrayRecursion1 {
    static void printArray(int[] arr,int idx){
        //Base case
        if(idx == arr.length) return; 
            System.out.print(arr[idx]+ " ");
        
          printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements :");
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elements: ");
        printArray(arr, 0);
        scan.close(); // It  is used to close the Scanner object "scan" after all the input reading operations are done, ensuring that there are no lingering connections to System.in after the program execution finishes.
    }
}
