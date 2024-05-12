package com.ravi.Sorting;

public class Bubble_Sort {
    static void bubble_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,9,8,5,4,3,1};
        bubble_sort(arr);
        for(int element :arr){
            System.out.print(element+ " ");
        }
    }

}
