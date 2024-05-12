package com.ravi.Binary_Search;

public class FindTargetIndex {
    static void displayArray(int[] array){
        for(int ele : array){
            System.out.print(ele+ " ");
        }
    }
    static int findIndex(int[] arr,int target){
        int start =0;
        int n = arr.length;
        int end = n-1;
        int idx = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                idx = mid;
                return idx;
            }
            if(arr[mid]>target){
                start = mid-1;
            }
            if(arr[mid]<target){

            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        displayArray(arr);

    }
}
