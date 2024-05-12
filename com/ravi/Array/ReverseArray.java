package com.ravi.Array;
import java.util.Scanner;

public class ReverseArray {
    static void printArray(int[] arr){
        System.out.println("Array before reversing ");
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    static void reverse(int[] arr){
        int n = arr.length;
        System.out.println("\nArray after reversing ");
        for(int i=n-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        reverse(arr);
    }
}
