package com.ravi.Binary_Search;

public class FindMin { // Find minimum in rotated sorted Array
    static void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element+ " ");
        }
        System.out.println();
    }
    static int findMin(int[] arr){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= arr[n-1]){
                    ans = mid;
                    end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        System.out.println("Given rotated sorted Array");
        printArray(arr);
        System.out.println("Index of min element");
        System.out.println(findMin(arr));



    }
}
