package com.ravi.Array;

import java.util.Scanner;

public class ChangeArrayElement {

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+ " elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Copied Array");
        int[] arr_2 =arr;
        printArray(arr_2);
        System.out.println("Trying to change arr_2 so give input for this");
        arr_2[0]=sc.nextInt();
        arr_2[1]=sc.nextInt();
        System.out.println("arr_2 after changing");
        printArray(arr_2);
        System.out.println("arr after changing in arr_2");
        printArray(arr);
    }
    
}

