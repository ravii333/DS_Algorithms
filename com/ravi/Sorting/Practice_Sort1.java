package com.ravi.Sorting;

public class Practice_Sort1 {
    /*Given a Sorted increasing Array except  two swapped elements sort it in linear  where
    no duplicate element exists
    */
    static void displayArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " " );
        }
        System.out.println();
    }
    static void sortElement(int[] arr){
        int x = -1;
        int y = -1;
        int n = arr.length;
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if (x == -1) {
                    x = i - 1;
                    y = i;
                }
                else {
                    y = i;
                }
            }

        }
        //Swapping element at x and y index
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] =temp;
    }
    public static void main(String[] args) {
        System.out.println("Given Sored Array except two swapped element :");
        int[] arr = {3, 8, 6,7, 5, 9, 10};
        displayArray(arr);
        sortElement(arr);
        System.out.println("Sorted array");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
