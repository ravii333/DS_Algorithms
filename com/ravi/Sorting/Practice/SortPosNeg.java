package com.ravi.Sorting.Practice;

public class SortPosNeg {
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    static void partition(int[] num){
        int start = 0;
        int end = num.length-1;
        while(start<end){
            while(num[start]<0) start++;
            while(num[end]>= 0) end--;
            if(start<end){
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {19,-20,7,-4,-13,11,-5,3};
        System.out.println("Input Array");
        printArray(num);
        System.out.println("Positive & Negative segregated Array");
        partition(num);
        printArray(num);
    }
}
