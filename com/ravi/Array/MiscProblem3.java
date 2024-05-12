package com.ravi.Array;
import java.util.Scanner;

public class MiscProblem3 {
    static int[] rotate(int[] arr,int k){
        int n= arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++) {
            ans[j++] = arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value for k ");
        int k = sc.nextInt();
        System.out.println("original array ");
        printArray(arr);
        int[] ans = rotate(arr,k);
        System.out.println("Array after Rotation ");
        printArray(ans);
    }
}
