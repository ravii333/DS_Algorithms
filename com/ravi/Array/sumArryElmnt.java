package com.ravi.Array;

public class sumArryElmnt {

    static void arraySum()
    {
        int sum=0;
        int arr[]={1,5,3};
        for(int i =0; i<arr.length ;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array is "+ sum);
    }
    public static void main(String[] args) {
        arraySum();
    }
}
