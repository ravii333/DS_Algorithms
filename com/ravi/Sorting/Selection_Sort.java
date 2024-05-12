package com.ravi.Sorting;

public class Selection_Sort {
    // SELECTION SORT ALGORITHM
    static void selectionSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){ // i is current index
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index!=i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,4,3,5,9,2,1};
        selectionSort(arr);
        for(int element:arr){
            System.out.print(element+ " ");
        }
    }
}
