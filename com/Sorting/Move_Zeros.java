package com.Sorting;

public class Move_Zeros {
     // It uses Bubble sort Algorithm

    static void moveZeros(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 || arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,42};
        moveZeros(arr);
        for(int ele : arr){
            System.out.println(ele+ " ");
        }

    }

}
