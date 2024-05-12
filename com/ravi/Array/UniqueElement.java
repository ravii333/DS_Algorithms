package com.ravi.Array;

import java.util.Scanner;
//here in the array all elements are being repeated only one is unique
public class UniqueElement {
    static int findUniqueElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique Element is "+findUniqueElement(arr));
        sc.close();
    }
}
