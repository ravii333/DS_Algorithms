package com.Recursion;

import java.util.Scanner;

public class SubSetSum {
    static void subsetSum(int[] arr,int n,int idx,int subSum){
        if(idx>=n){
            System.out.println(subSum);
            return;
        }
        //Include arr[idx] element
        subsetSum(arr,n,idx+1,subSum+arr[idx]);
        //Exclude arr[idx] element
        subsetSum(arr,n,idx+1,subSum);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
        subsetSum(arr,arr.length,0,0);

    }
}
