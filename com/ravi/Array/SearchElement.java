package com.ravi.Array;

import java.util.Scanner;

public class SearchElement {

    static void  searchingInArray(int[] arr){
        System.out.print("Enter the element to be searched:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans= -1;
        for (int i= 0;i<arr.length;i++) {
            if (arr[i] == x) {
                ans= i;
            }
          }
        if(ans==-1){
            System.out.println("Not found");
        }
        System.out.println("Found " +x+ "at index"+ans);

        }
    static void printArray(int[] arr){
        for( int i= 0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Array size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        printArray(arr);
        searchingInArray(arr);
    }
}
